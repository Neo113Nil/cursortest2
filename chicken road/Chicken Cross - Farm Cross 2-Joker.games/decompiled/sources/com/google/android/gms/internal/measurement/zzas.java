package com.google.android.gms.internal.measurement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* loaded from: classes8.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027e  */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        zzas zzasVar;
        int i;
        zzas zzasVar2;
        int i2;
        int i3;
        zzg zzgVar2;
        int i4;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || InAppPurchaseConstants.METHOD_TO_STRING.equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        if (str.equals(str5)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1776922004:
                        str4 = "charAt";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        if (str.equals(str6)) {
                            c = 14;
                            str5 = str3;
                            break;
                        } else {
                            str5 = str3;
                            c = 65535;
                            break;
                        }
                    case -1464939364:
                        str4 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c = '\f';
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -1361633751:
                        str4 = "charAt";
                        if (str.equals(str4)) {
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            c = 0;
                            break;
                        }
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            c = 1;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c = '\r';
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c = 7;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c = 11;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c = 4;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case -399551817:
                        if (str.equals("toUpperCase")) {
                            c = 15;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c = 16;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c = 5;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c = '\b';
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = '\t';
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c = '\n';
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c = 6;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c = 3;
                            str4 = "charAt";
                            str5 = str3;
                            str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                            break;
                        }
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                    default:
                        str4 = "charAt";
                        str5 = str3;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        c = 65535;
                        break;
                }
                String str7 = AdError.UNDEFINED_DOMAIN;
                String str8 = str5;
                String str9 = str4;
                switch (c) {
                    case 0:
                        zzh.zzc(str9, 1, list);
                        int zzi = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                        String str10 = this.zza;
                        return (zzi < 0 || zzi >= str10.length()) ? zzao.zzm : new zzas(String.valueOf(str10.charAt(zzi)));
                    case 1:
                        zzasVar = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder(zzasVar.zza);
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                sb.append(zzgVar.zza((zzao) list.get(i5)).zzc());
                            }
                            return new zzas(sb.toString());
                        }
                        return zzasVar;
                    case 2:
                        zzh.zza(str8, 1, list);
                        String str11 = this.zza;
                        zzao zza = zzgVar.zza((zzao) list.get(0));
                        if ("length".equals(zza.zzc())) {
                            return zzaf.zzk;
                        }
                        double doubleValue = zza.zzd().doubleValue();
                        return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str11.length()) ? zzaf.zzl : zzaf.zzk;
                    case 3:
                        zzh.zzc("indexOf", 2, list);
                        String str12 = this.zza;
                        if (list.size() > 0) {
                            str7 = zzgVar.zza((zzao) list.get(0)).zzc();
                        }
                        return new zzah(Double.valueOf(str12.indexOf(str7, (int) zzh.zzi(list.size() < 2 ? 0.0d : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()))));
                    case 4:
                        zzh.zzc("lastIndexOf", 2, list);
                        String str13 = this.zza;
                        if (list.size() > 0) {
                            str7 = zzgVar.zza((zzao) list.get(0)).zzc();
                        }
                        String str14 = str7;
                        return new zzah(Double.valueOf(str13.lastIndexOf(str14, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(r1)))));
                    case 5:
                        zzh.zzc("match", 1, list);
                        Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                        return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
                    case 6:
                        zzasVar = this;
                        zzh.zzc("replace", 2, list);
                        zzao zzaoVar = zzao.zzf;
                        if (!list.isEmpty()) {
                            str7 = zzgVar.zza((zzao) list.get(0)).zzc();
                            if (list.size() > 1) {
                                zzaoVar = zzgVar.zza((zzao) list.get(1));
                            }
                        }
                        String str15 = str7;
                        String str16 = zzasVar.zza;
                        int indexOf = str16.indexOf(str15);
                        if (indexOf >= 0) {
                            if (zzaoVar instanceof zzai) {
                                zzaoVar = ((zzai) zzaoVar).zza(zzgVar, Arrays.asList(new zzas(str15), new zzah(Double.valueOf(indexOf)), zzasVar));
                            }
                            String substring = str16.substring(0, indexOf);
                            String zzc = zzaoVar.zzc();
                            String substring2 = str16.substring(indexOf + str15.length());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(zzc).length() + String.valueOf(substring2).length());
                            sb2.append(substring);
                            sb2.append(zzc);
                            sb2.append(substring2);
                            zzasVar2 = new zzas(sb2.toString());
                            return zzasVar2;
                        }
                        return zzasVar;
                    case 7:
                        zzh.zzc("search", 1, list);
                        if (!list.isEmpty()) {
                            str7 = zzgVar.zza((zzao) list.get(0)).zzc();
                        }
                        return Pattern.compile(str7).matcher(this.zza).find() ? new zzah(Double.valueOf(r1.start())) : new zzah(Double.valueOf(-1.0d));
                    case '\b':
                        zzh.zzc("slice", 2, list);
                        String str17 = this.zza;
                        double zzi2 = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                        double max = zzi2 < 0.0d ? Math.max(str17.length() + zzi2, 0.0d) : Math.min(zzi2, str17.length());
                        double zzi3 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str17.length());
                        int i6 = (int) max;
                        return new zzas(str17.substring(i6, Math.max(0, ((int) (zzi3 < 0.0d ? Math.max(str17.length() + zzi3, 0.0d) : Math.min(zzi3, str17.length()))) - i6) + i6));
                    case '\t':
                        zzh.zzc("split", 2, list);
                        String str18 = this.zza;
                        if (str18.length() == 0) {
                            return new zzae(Arrays.asList(this));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (list.isEmpty()) {
                            arrayList.add(this);
                        } else {
                            String zzc2 = zzgVar.zza((zzao) list.get(0)).zzc();
                            long zzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                            if (zzh == 0) {
                                return new zzae();
                            }
                            String[] split = str18.split(Pattern.quote(zzc2), ((int) zzh) + 1);
                            int length = split.length;
                            if (!zzc2.isEmpty() || length <= 0) {
                                i2 = length;
                                i3 = 0;
                            } else {
                                boolean isEmpty = split[0].isEmpty();
                                i2 = length - 1;
                                i3 = isEmpty;
                                if (!split[i2].isEmpty()) {
                                    i2 = length;
                                    i3 = isEmpty;
                                }
                            }
                            if (length > zzh) {
                                i2--;
                            }
                            while (i3 < i2) {
                                arrayList.add(new zzas(split[i3]));
                                i3++;
                            }
                        }
                        return new zzae(arrayList);
                    case '\n':
                        zzh.zzc("substring", 2, list);
                        String str19 = this.zza;
                        if (list.isEmpty()) {
                            zzgVar2 = zzgVar;
                            i4 = 0;
                        } else {
                            zzgVar2 = zzgVar;
                            i4 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                        }
                        int zzi4 = list.size() > 1 ? (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()) : str19.length();
                        int min = Math.min(Math.max(i4, 0), str19.length());
                        int min2 = Math.min(Math.max(zzi4, 0), str19.length());
                        zzasVar2 = new zzas(str19.substring(Math.min(min, min2), Math.max(min, min2)));
                        return zzasVar2;
                    case 11:
                        zzh.zza(str2, 0, list);
                        return new zzas(this.zza.toUpperCase());
                    case '\f':
                        zzh.zza("toLocaleLowerCase", 0, list);
                        return new zzas(this.zza.toLowerCase());
                    case '\r':
                        zzh.zza("toLowerCase", 0, list);
                        return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                    case 14:
                        zzasVar = this;
                        zzh.zza(str6, 0, list);
                        return zzasVar;
                    case 15:
                        zzh.zza("toUpperCase", 0, list);
                        return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                    case 16:
                        zzh.zza("toUpperCase", 0, list);
                        return new zzas(this.zza.trim());
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str3 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        String str72 = AdError.UNDEFINED_DOMAIN;
        String str82 = str5;
        String str92 = str4;
        switch (c) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
