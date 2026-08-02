package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.C1190e;

@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n42#2,7:365\n52#2:372\n55#2:373\n62#2,4:374\n66#2:379\n68#2:381\n74#2,23:382\n102#2,23:405\n129#2,2:428\n131#2,9:431\n143#2:440\n146#2:441\n149#2:442\n152#2:443\n160#2:444\n170#2,3:445\n169#2:448\n183#2,2:449\n188#2:451\n192#2:452\n196#2:453\n200#2:454\n204#2,7:455\n217#2:462\n221#2,8:463\n233#2,4:471\n242#2,5:475\n251#2,6:480\n257#2,9:487\n301#2,8:496\n129#2,2:504\n131#2,9:507\n312#2,9:516\n67#3:378\n73#3:380\n73#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
/* renamed from: okio.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1193h implements Serializable, Comparable<C1193h> {
    public static final a Companion = new a();

    @JvmField
    public static final C1193h d = new C1193h(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public transient int b;
    public transient String c;

    @SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 ByteStringNonJs.kt\nokio/internal/-ByteStringNonJs\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n269#2:365\n273#2,3:366\n280#2,3:369\n287#2,2:372\n25#3:374\n27#3,7:376\n1#4:375\n1#4:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    /* renamed from: okio.h$a */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
        
            r6 = null;
         */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C1193h a(String str) {
            int i;
            char charAt;
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArr = C1186a.a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            int length = str.length();
            while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                length--;
            }
            int i2 = (int) ((length * 6) / 8);
            byte[] bArr2 = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 < length) {
                    char charAt2 = str.charAt(i3);
                    if ('A' <= charAt2 && charAt2 < '[') {
                        i = charAt2 - 'A';
                    } else if ('a' <= charAt2 && charAt2 < '{') {
                        i = charAt2 - 'G';
                    } else if ('0' <= charAt2 && charAt2 < ':') {
                        i = charAt2 + 4;
                    } else if (charAt2 == '+' || charAt2 == '-') {
                        i = 62;
                    } else if (charAt2 == '/' || charAt2 == '_') {
                        i = 63;
                    } else {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                            break;
                        }
                        i3++;
                    }
                    i5 = (i5 << 6) | i;
                    i4++;
                    if (i4 % 4 == 0) {
                        bArr2[i6] = (byte) (i5 >> 16);
                        int i7 = i6 + 2;
                        bArr2[i6 + 1] = (byte) (i5 >> 8);
                        i6 += 3;
                        bArr2[i7] = (byte) i5;
                    }
                    i3++;
                } else {
                    int i8 = i4 % 4;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            bArr2[i6] = (byte) ((i5 << 12) >> 16);
                            i6++;
                        } else if (i8 == 3) {
                            int i9 = i5 << 6;
                            int i10 = i6 + 1;
                            bArr2[i6] = (byte) (i9 >> 16);
                            i6 += 2;
                            bArr2[i10] = (byte) (i9 >> 8);
                        }
                        if (i6 != i2) {
                            bArr2 = Arrays.copyOf(bArr2, i6);
                            Intrinsics.checkNotNullExpressionValue(bArr2, "copyOf(...)");
                        }
                    }
                }
            }
            if (bArr2 != null) {
                return new C1193h(bArr2);
            }
            return null;
        }

        @JvmStatic
        public static C1193h b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (okio.internal.c.a(str.charAt(i2 + 1)) + (okio.internal.c.a(str.charAt(i2)) << 4));
            }
            return new C1193h(bArr);
        }

        @JvmStatic
        public static C1193h c(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            C1193h c1193h = new C1193h(bytes);
            c1193h.c = str;
            return c1193h;
        }

        public static C1193h d(a aVar, byte[] bArr) {
            C1190e.a aVar2 = C1187b.a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int length = bArr.length;
            C1187b.b(bArr.length, 0, length);
            return new C1193h(ArraysKt.copyOfRange(bArr, 0, length));
        }
    }

    public C1193h(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = data;
    }

    public static int g(C1193h c1193h, C1193h other) {
        c1193h.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c1193h.f(other.h(), 0);
    }

    public static int k(C1193h c1193h, C1193h other) {
        int i = C1187b.b;
        c1193h.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c1193h.j(other.h(), i);
    }

    public static C1193h p(C1193h c1193h, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = C1187b.b;
        }
        return c1193h.o(i, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        Companion.getClass();
        Intrinsics.checkNotNullParameter(objectInputStream, "<this>");
        if (readInt < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(readInt, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        C1193h c1193h = new C1193h(bArr);
        Field declaredField = C1193h.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, c1193h.a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    public String a() {
        byte[] bArr = this.a;
        byte[] map = C1186a.a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr2[i2] = map[(b & UByte.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[((b & 3) << 4) | ((b2 & UByte.MAX_VALUE) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b2 & 15) << 2) | ((b3 & UByte.MAX_VALUE) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr2[i2] = map[(b4 & UByte.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[(b4 & 3) << 4];
            bArr2[i2 + 2] = Base64.padSymbol;
            bArr2[i2 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr2[i2] = map[(b5 & UByte.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[((b5 & 3) << 4) | ((b6 & UByte.MAX_VALUE) >> 4)];
            bArr2[i2 + 2] = map[(b6 & 15) << 2];
            bArr2[i2 + 3] = Base64.padSymbol;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1193h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int d2 = d();
        int d3 = other.d();
        int min = Math.min(d2, d3);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & UByte.MAX_VALUE;
            int i3 = other.i(i) & UByte.MAX_VALUE;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (d2 == d3) {
            return 0;
        }
        return d2 < d3 ? -1 : 1;
    }

    public C1193h c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.a, 0, d());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new C1193h(digest);
    }

    public int d() {
        return this.a.length;
    }

    public String e() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = okio.internal.b.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1193h) {
            C1193h c1193h = (C1193h) obj;
            int d2 = c1193h.d();
            byte[] bArr = this.a;
            if (d2 == bArr.length && c1193h.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public int f(byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.a.length - other.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!C1187b.a(this.a, max, other, 0, other.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] h() {
        return this.a;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.a[i];
    }

    @JvmOverloads
    public int j(byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(C1187b.c(this, i), this.a.length - other.length); -1 < min; min--) {
            if (C1187b.a(this.a, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, C1193h other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.m(0, this.a, i, i2);
    }

    public boolean m(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.a;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && C1187b.a(bArr, i, other, i2, i3);
    }

    public String n(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.a, charset);
    }

    @JvmOverloads
    public C1193h o(int i, int i2) {
        int c = C1187b.c(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.a;
        if (c > bArr.length) {
            throw new IllegalArgumentException(androidx.collection.i.c(new StringBuilder("endIndex > length("), this.a.length, ')').toString());
        }
        if (c - i >= 0) {
            return (i == 0 && c == bArr.length) ? this : new C1193h(ArraysKt.copyOfRange(bArr, i, c));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C1193h q() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C1193h(copyOf);
            }
            i++;
        }
    }

    public final String r() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        byte[] h = h();
        Intrinsics.checkNotNullParameter(h, "<this>");
        String str2 = new String(h, Charsets.UTF_8);
        this.c = str2;
        return str2;
    }

    public void s(int i, C1190e buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.m3358write(this.a, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00fb, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0137, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013b, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00db, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x017a, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0181, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0173, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b3, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01b6, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b9, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0147, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01bc, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x007a, code lost:
    
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0099, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0088, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r6 == 64) goto L181;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String replace$default;
        String replace$default2;
        String replace$default3;
        byte b;
        int i;
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ ByteCompanionObject.MIN_VALUE) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            Unit unit = Unit.INSTANCE;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.INSTANCE;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            Unit unit3 = Unit.INSTANCE;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String r = r();
            String substring = r.substring(0, i3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            replace$default = StringsKt__StringsJVMKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "\n", "\\n", false, 4, (Object) null);
            replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "\r", "\\r", false, 4, (Object) null);
            if (i3 >= r.length()) {
                return androidx.compose.runtime.t.c("[text=", ']', replace$default3);
            }
            return "[size=" + this.a.length + " text=" + replace$default3 + "…]";
        }
        if (this.a.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.a.length);
        sb.append(" hex=");
        int c = C1187b.c(this, 64);
        byte[] bArr2 = this.a;
        if (c > bArr2.length) {
            throw new IllegalArgumentException(androidx.collection.i.c(new StringBuilder("endIndex > length("), this.a.length, ')').toString());
        }
        if (c < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb.append((c == bArr2.length ? this : new C1193h(ArraysKt.copyOfRange(bArr2, 0, c))).e());
        sb.append("…]");
        return sb.toString();
    }
}
