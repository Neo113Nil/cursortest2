package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zzwv = {'u', 'l', 'l'};
    private static final char[] zzww = {'r', 'u', 'e'};
    private static final char[] zzwx = {'r', 'u', 'e', '\"'};
    private static final char[] zzwy = {'a', 'l', 's', 'e'};
    private static final char[] zzwz = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zzxa = {'\n'};
    private static final zza<Integer> zzxc = new com.google.android.gms.common.server.response.zza();
    private static final zza<Long> zzxd = new zzb();
    private static final zza<Float> zzxe = new zzc();
    private static final zza<Double> zzxf = new zzd();
    private static final zza<Boolean> zzxg = new zze();
    private static final zza<String> zzxh = new zzf();
    private static final zza<BigInteger> zzxi = new zzg();
    private static final zza<BigDecimal> zzxj = new zzh();
    private final char[] zzwq = new char[1];
    private final char[] zzwr = new char[32];
    private final char[] zzws = new char[1024];
    private final StringBuilder zzwt = new StringBuilder(32);
    private final StringBuilder zzwu = new StringBuilder(1024);
    private final Stack<Integer> zzxb = new Stack<>();

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface zza<O> {
        O zzh(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final int zza(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char zzj = zzj(bufferedReader);
        if (zzj == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (zzj == ',') {
            throw new ParseException("Missing value");
        }
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zzj == '\"') {
            i = 0;
            boolean z = false;
            while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c == '\"' && !z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    return i;
                }
                z = c == '\\' ? !z : false;
                i++;
            }
        } else {
            cArr[0] = zzj;
            i = 1;
            while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                if (cArr[i] == '}' || cArr[i] == ',' || Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == cArr.length) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    private final String zza(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zzxb.push(2);
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            this.zzxb.push(3);
            String zzb = zzb(bufferedReader, this.zzwr, this.zzwt, null);
            zzk(3);
            if (zzj(bufferedReader) == ':') {
                return zzb;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (zzj == ']') {
            zzk(2);
            zzk(1);
            zzk(5);
            return null;
        }
        if (zzj == '}') {
            zzk(2);
            return null;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(zzj);
        throw new ParseException(sb.toString());
    }

    private final String zza(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            return zzb(bufferedReader, cArr, sb, cArr2);
        }
        if (zzj != 'n') {
            throw new ParseException("Expected string");
        }
        zzb(bufferedReader, zzwv);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends FastJsonResponse> ArrayList<T> zza(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        char zzj = zzj(bufferedReader);
        if (zzj == ']') {
            zzk(5);
            return arrayList;
        }
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            zzk(5);
            return null;
        }
        if (zzj != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zzj);
            throw new ParseException(sb.toString());
        }
        Stack<Integer> stack = this.zzxb;
        while (true) {
            stack.push(1);
            try {
                FastJsonResponse newConcreteTypeInstance = field.newConcreteTypeInstance();
                if (!zza(bufferedReader, newConcreteTypeInstance)) {
                    return arrayList;
                }
                arrayList.add(newConcreteTypeInstance);
                char zzj2 = zzj(bufferedReader);
                if (zzj2 != ',') {
                    if (zzj2 == ']') {
                        zzk(5);
                        return arrayList;
                    }
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(zzj2);
                    throw new ParseException(sb2.toString());
                }
                if (zzj(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                stack = this.zzxb;
            } catch (IllegalAccessException e) {
                throw new ParseException("Error instantiating inner object", e);
            } catch (InstantiationException e2) {
                throw new ParseException("Error instantiating inner object", e2);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final <O> ArrayList<O> zza(BufferedReader bufferedReader, zza<O> zzaVar) throws ParseException, IOException {
        char zzj = zzj(bufferedReader);
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return null;
        }
        if (zzj != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zzxb.push(5);
        ArrayList<O> arrayList = new ArrayList<>();
        while (true) {
            bufferedReader.mark(1024);
            char zzj2 = zzj(bufferedReader);
            if (zzj2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (zzj2 != ',') {
                if (zzj2 == ']') {
                    zzk(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zzaVar.zzh(this, bufferedReader));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
    
        zzk(1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0291 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zza(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        byte[] decode;
        HashMap hashMap;
        char zzj;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String zza2 = zza(bufferedReader);
        if (zza2 == null) {
            zzk(1);
            return false;
        }
        while (zza2 != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(zza2);
            if (field == null) {
                zza2 = zzb(bufferedReader);
            } else {
                this.zzxb.push(4);
                switch (field.getTypeIn()) {
                    case 0:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setIntegers((FastJsonResponse.Field) field, (ArrayList<Integer>) zza(bufferedReader, zzxc));
                        } else {
                            fastJsonResponse.setInteger(field, zzd(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                            zza2 = zza(bufferedReader);
                            break;
                        } else {
                            if (zzj != '}') {
                                StringBuilder sb = new StringBuilder(55);
                                sb.append("Expected end of object or field separator, but found: ");
                                sb.append(zzj);
                                throw new ParseException(sb.toString());
                            }
                            zza2 = null;
                            break;
                        }
                    case 1:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setBigIntegers((FastJsonResponse.Field) field, (ArrayList<BigInteger>) zza(bufferedReader, zzxi));
                        } else {
                            fastJsonResponse.setBigInteger(field, zzf(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 2:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setLongs((FastJsonResponse.Field) field, (ArrayList<Long>) zza(bufferedReader, zzxd));
                        } else {
                            fastJsonResponse.setLong(field, zze(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 3:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setFloats((FastJsonResponse.Field) field, (ArrayList<Float>) zza(bufferedReader, zzxe));
                        } else {
                            fastJsonResponse.setFloat(field, zzg(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 4:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setDoubles((FastJsonResponse.Field) field, (ArrayList<Double>) zza(bufferedReader, zzxf));
                        } else {
                            fastJsonResponse.setDouble(field, zzh(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 5:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setBigDecimals((FastJsonResponse.Field) field, (ArrayList<BigDecimal>) zza(bufferedReader, zzxj));
                        } else {
                            fastJsonResponse.setBigDecimal(field, zzi(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 6:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setBooleans((FastJsonResponse.Field) field, (ArrayList<Boolean>) zza(bufferedReader, zzxg));
                        } else {
                            fastJsonResponse.setBoolean(field, zza(bufferedReader, false));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 7:
                        if (field.isTypeInArray()) {
                            fastJsonResponse.setStrings((FastJsonResponse.Field) field, (ArrayList<String>) zza(bufferedReader, zzxh));
                        } else {
                            fastJsonResponse.setString(field, zzc(bufferedReader));
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 8:
                        decode = Base64Utils.decode(zza(bufferedReader, this.zzws, this.zzwu, zzxa));
                        fastJsonResponse.setDecodedBytes(field, decode);
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 9:
                        decode = Base64Utils.decodeUrlSafe(zza(bufferedReader, this.zzws, this.zzwu, zzxa));
                        fastJsonResponse.setDecodedBytes(field, decode);
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 10:
                        char zzj2 = zzj(bufferedReader);
                        if (zzj2 == 'n') {
                            zzb(bufferedReader, zzwv);
                            hashMap = null;
                        } else {
                            if (zzj2 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.zzxb.push(1);
                            hashMap = new HashMap();
                            while (true) {
                                char zzj3 = zzj(bufferedReader);
                                if (zzj3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (zzj3 == '\"') {
                                    String zzb = zzb(bufferedReader, this.zzwr, this.zzwt, null);
                                    if (zzj(bufferedReader) != ':') {
                                        String valueOf = String.valueOf(zzb);
                                        throw new ParseException(valueOf.length() != 0 ? "No map value found for key ".concat(valueOf) : new String("No map value found for key "));
                                    }
                                    if (zzj(bufferedReader) != '\"') {
                                        String valueOf2 = String.valueOf(zzb);
                                        throw new ParseException(valueOf2.length() != 0 ? "Expected String value for key ".concat(valueOf2) : new String("Expected String value for key "));
                                    }
                                    hashMap.put(zzb, zzb(bufferedReader, this.zzwr, this.zzwt, null));
                                    char zzj4 = zzj(bufferedReader);
                                    if (zzj4 != ',') {
                                        if (zzj4 != '}') {
                                            StringBuilder sb2 = new StringBuilder(48);
                                            sb2.append("Unexpected character while parsing string map: ");
                                            sb2.append(zzj4);
                                            throw new ParseException(sb2.toString());
                                        }
                                    }
                                } else if (zzj3 == '}') {
                                    break;
                                }
                            }
                        }
                        fastJsonResponse.setStringMap(field, hashMap);
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    case 11:
                        if (field.isTypeInArray()) {
                            char zzj5 = zzj(bufferedReader);
                            if (zzj5 == 'n') {
                                zzb(bufferedReader, zzwv);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), null);
                            } else {
                                this.zzxb.push(5);
                                if (zzj5 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), zza(bufferedReader, field));
                            }
                        } else {
                            char zzj6 = zzj(bufferedReader);
                            if (zzj6 == 'n') {
                                zzb(bufferedReader, zzwv);
                                fastJsonResponse.addConcreteTypeInternal(field, field.getOutputFieldName(), null);
                            } else {
                                this.zzxb.push(1);
                                if (zzj6 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse newConcreteTypeInstance = field.newConcreteTypeInstance();
                                    zza(bufferedReader, newConcreteTypeInstance);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.getOutputFieldName(), newConcreteTypeInstance);
                                } catch (IllegalAccessException e) {
                                    throw new ParseException("Error instantiating inner object", e);
                                } catch (InstantiationException e2) {
                                    throw new ParseException("Error instantiating inner object", e2);
                                }
                            }
                        }
                        zzk(4);
                        zzk(2);
                        zzj = zzj(bufferedReader);
                        if (zzj != ',') {
                        }
                        break;
                    default:
                        int typeIn = field.getTypeIn();
                        StringBuilder sb3 = new StringBuilder(30);
                        sb3.append("Invalid field type ");
                        sb3.append(typeIn);
                        throw new ParseException(sb3.toString());
                }
            }
        }
        PostProcessor<? extends FastJsonResponse> postProcessor = fastJsonResponse.getPostProcessor();
        if (postProcessor != null) {
            postProcessor.postProcess(fastJsonResponse);
        }
        zzk(1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final boolean zza(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char zzj = zzj(bufferedReader);
            if (zzj != '\"') {
                if (zzj == 'f') {
                    zzb(bufferedReader, z ? zzwz : zzwy);
                    return false;
                }
                if (zzj == 'n') {
                    zzb(bufferedReader, zzwv);
                    return false;
                }
                if (zzj == 't') {
                    zzb(bufferedReader, z ? zzwx : zzww);
                    return true;
                }
                StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(zzj);
                throw new ParseException(sb.toString());
            }
            if (z) {
                throw new ParseException("No boolean value found in string");
            }
            z = true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final String zzb(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            if (bufferedReader.read(this.zzwq) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c = this.zzwq[0];
            boolean z = false;
            do {
                if (c != '\"' || z) {
                    z = c == '\\' ? !z : false;
                    if (bufferedReader.read(this.zzwq) == -1) {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                    c = this.zzwq[0];
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        }
        if (zzj == ',') {
            throw new ParseException("Missing value");
        }
        int i = 1;
        if (zzj == '[') {
            this.zzxb.push(5);
            bufferedReader.mark(32);
            if (zzj(bufferedReader) != ']') {
                bufferedReader.reset();
                boolean z2 = false;
                boolean z3 = false;
                while (i > 0) {
                    char zzj2 = zzj(bufferedReader);
                    if (zzj2 == 0) {
                        throw new ParseException("Unexpected EOF while parsing array");
                    }
                    if (Character.isISOControl(zzj2)) {
                        throw new ParseException("Unexpected control character while reading array");
                    }
                    if (zzj2 == '\"' && !z2) {
                        z3 = !z3;
                    }
                    if (zzj2 == '[' && !z3) {
                        i++;
                    }
                    if (zzj2 == ']' && !z3) {
                        i--;
                    }
                    z2 = (zzj2 == '\\' && z3) ? !z2 : false;
                }
            }
            zzk(5);
        } else if (zzj != '{') {
            bufferedReader.reset();
            zza(bufferedReader, this.zzws);
        } else {
            this.zzxb.push(1);
            bufferedReader.mark(32);
            char zzj3 = zzj(bufferedReader);
            if (zzj3 != '}') {
                if (zzj3 != '\"') {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(zzj3);
                    throw new ParseException(sb.toString());
                }
                bufferedReader.reset();
                zza(bufferedReader);
                while (zzb(bufferedReader) != null) {
                }
            }
            zzk(1);
        }
        char zzj4 = zzj(bufferedReader);
        if (zzj4 == ',') {
            zzk(2);
            return zza(bufferedReader);
        }
        if (zzj4 == '}') {
            zzk(2);
            return null;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(zzj4);
        throw new ParseException(sb2.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static String zzb(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        boolean z;
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            boolean z4 = z3;
            boolean z5 = z2;
            for (int i = 0; i < read; i++) {
                char c = cArr[i];
                if (Character.isISOControl(c)) {
                    if (cArr2 != null) {
                        for (char c2 : cArr2) {
                            if (c2 == c) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        throw new ParseException("Unexpected control character while reading string");
                    }
                }
                if (c == '\"' && !z5) {
                    sb.append(cArr, 0, i);
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    return z4 ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                }
                if (c == '\\') {
                    z5 = !z5;
                    z4 = true;
                } else {
                    z5 = false;
                }
            }
            sb.append(cArr, 0, read);
            bufferedReader.mark(cArr.length);
            z2 = z5;
            z3 = z4;
        }
    }

    private final void zzb(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zzwr, 0, cArr.length - i);
            if (read == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i2 = 0; i2 < read; i2++) {
                if (cArr[i2 + i] != this.zzwr[i2]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzc(BufferedReader bufferedReader) throws ParseException, IOException {
        return zza(bufferedReader, this.zzwr, this.zzwt, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final int zzd(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0;
        }
        char[] cArr = this.zzws;
        if (zza2 <= 0) {
            throw new ParseException("No number to parse");
        }
        if (cArr[0] == '-') {
            i = 1;
            z = true;
            i2 = Integer.MIN_VALUE;
        } else {
            i = 0;
            z = false;
            i2 = -2147483647;
        }
        if (i < zza2) {
            i3 = i + 1;
            int digit = Character.digit(cArr[i], 10);
            if (digit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i4 = -digit;
        } else {
            i3 = i;
            i4 = 0;
        }
        while (i3 < zza2) {
            int i5 = i3 + 1;
            int digit2 = Character.digit(cArr[i3], 10);
            if (digit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i4 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i6 = i4 * 10;
            if (i6 < i2 + digit2) {
                throw new ParseException("Number too large");
            }
            i4 = i6 - digit2;
            i3 = i5;
        }
        if (!z) {
            return -i4;
        }
        if (i3 > 1) {
            return i4;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final long zze(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        boolean z;
        long j2;
        int i;
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0L;
        }
        char[] cArr = this.zzws;
        if (zza2 <= 0) {
            throw new ParseException("No number to parse");
        }
        int i2 = 0;
        if (cArr[0] == '-') {
            j = Long.MIN_VALUE;
            i2 = 1;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        if (i2 < zza2) {
            i = i2 + 1;
            int digit = Character.digit(cArr[i2], 10);
            if (digit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j2 = -digit;
        } else {
            j2 = 0;
            i = i2;
        }
        while (i < zza2) {
            int i3 = i + 1;
            int digit2 = Character.digit(cArr[i], 10);
            if (digit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j2 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j3 = j2 * 10;
            long j4 = digit2;
            if (j3 < j + j4) {
                throw new ParseException("Number too large");
            }
            j2 = j3 - j4;
            i = i3;
        }
        if (!z) {
            return -j2;
        }
        if (i > 1) {
            return j2;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zzf(BufferedReader bufferedReader) throws ParseException, IOException {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zzws, 0, zza2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zzg(BufferedReader bufferedReader) throws ParseException, IOException {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zzws, 0, zza2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zzh(BufferedReader bufferedReader) throws ParseException, IOException {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zzws, 0, zza2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zzi(BufferedReader bufferedReader) throws ParseException, IOException {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zzws, 0, zza2));
    }

    private final char zzj(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zzwq) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.zzwq[0])) {
            if (bufferedReader.read(this.zzwq) == -1) {
                return (char) 0;
            }
        }
        return this.zzwq[0];
    }

    private final void zzk(int i) throws ParseException {
        if (this.zzxb.isEmpty()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new ParseException(sb.toString());
        }
        int intValue = this.zzxb.pop().intValue();
        if (intValue == i) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had ");
        sb2.append(intValue);
        throw new ParseException(sb2.toString());
    }

    public void parse(InputStream inputStream, T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zzxb.push(0);
                char zzj = zzj(bufferedReader);
                if (zzj == 0) {
                    throw new ParseException("No data to parse");
                }
                if (zzj == '[') {
                    this.zzxb.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.getOutputFieldName(), zza(bufferedReader, value));
                } else {
                    if (zzj != '{') {
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(zzj);
                        throw new ParseException(sb.toString());
                    }
                    this.zzxb.push(1);
                    zza(bufferedReader, t);
                }
                zzk(0);
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
        }
    }

    public void parse(String str, T t) throws ParseException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            parse((InputStream) byteArrayInputStream, (ByteArrayInputStream) t);
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
                Log.w("FastParser", "Failed to close the input stream while parsing.");
            }
        }
    }
}
