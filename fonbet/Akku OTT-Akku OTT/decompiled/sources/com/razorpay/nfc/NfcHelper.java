package com.razorpay.nfc;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.appcompat.view.menu.a;
import androidx.collection.g;
import androidx.credentials.provider.p;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J$\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00180\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u001a\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0004J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J&\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000eH\u0002J,\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010%2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u000bH\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u001e2\b\u0010\n\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\n\u0010+\u001a\u00020\u0004*\u00020\u000bJ\n\u0010,\u001a\u00020\u000b*\u00020\u0004¨\u0006."}, d2 = {"Lcom/razorpay/nfc/NfcHelper;", "", "()V", "buildPdolData", "", "pdolTemplate", "amexAlt", "", "containsTag", "tlv", "tag", "", "currentDateYYMMDD", "expectedLen", "", "currentTimeHHMMSS", "extractAfl", "tlvs", "", "Lcom/razorpay/nfc/NfcHelper$Tlv;", "extractAidFromPpse", "response", "extractPdolFromSelectResponse", "extractRecordsFromAfl", "Lkotlin/Pair;", "afl", "findFirstTagValue", "is6985", "isSuccess", "parseTlv", "Lcom/razorpay/nfc/CardData;", "data", "parseTlvList", "readLength", "bytes", "offset", "readTag", "Lkotlin/Triple;", "splitTrack2", "track2", "startCardScanner", "Landroid/nfc/Tag;", "stripStatusWord", "hexToByteArray", "toHexString", "Tlv", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NfcHelper {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/razorpay/nfc/NfcHelper$Tlv;", "", "tag", "", SessionDescription.ATTR_LENGTH, "", "value", "", "constructed", "", "(Ljava/lang/String;I[BZ)V", "getConstructed", "()Z", "getLength", "()I", "getTag", "()Ljava/lang/String;", "getValue", "()[B", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Tlv {
        private final int __l1_;
        private final boolean _l_1l__;
        private final byte[] _llI;
        private final String l$1_I$l$;

        public Tlv(String tag, int i, byte[] value, boolean z) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(value, "value");
            this.l$1_I$l$ = tag;
            this.__l1_ = i;
            this._llI = value;
            this._l_1l__ = z;
        }

        public static /* synthetic */ Tlv copy$default(Tlv tlv, String str, int i, byte[] bArr, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = tlv.l$1_I$l$;
            }
            if ((i2 & 2) != 0) {
                i = tlv.__l1_;
            }
            if ((i2 & 4) != 0) {
                bArr = tlv._llI;
            }
            if ((i2 & 8) != 0) {
                z = tlv._l_1l__;
            }
            return tlv.copy(str, i, bArr, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getL$1_I$l$() {
            return this.l$1_I$l$;
        }

        /* renamed from: component2, reason: from getter */
        public final int get__l1_() {
            return this.__l1_;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] get_llI() {
            return this._llI;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean get_l_1l__() {
            return this._l_1l__;
        }

        public final Tlv copy(String tag, int length, byte[] value, boolean constructed) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Tlv(tag, length, value, constructed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tlv)) {
                return false;
            }
            Tlv tlv = (Tlv) other;
            return Intrinsics.areEqual(this.l$1_I$l$, tlv.l$1_I$l$) && this.__l1_ == tlv.__l1_ && Intrinsics.areEqual(this._llI, tlv._llI) && this._l_1l__ == tlv._l_1l__;
        }

        public final boolean getConstructed() {
            return this._l_1l__;
        }

        public final int getLength() {
            return this.__l1_;
        }

        public final String getTag() {
            return this.l$1_I$l$;
        }

        public final byte[] getValue() {
            return this._llI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (Arrays.hashCode(this._llI) + g.a(this.__l1_, this.l$1_I$l$.hashCode() * 31, 31)) * 31;
            boolean z = this._l_1l__;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Tlv(tag=");
            sb.append(this.l$1_I$l$);
            sb.append(", length=");
            sb.append(this.__l1_);
            sb.append(", value=");
            sb.append(Arrays.toString(this._llI));
            sb.append(", constructed=");
            return a.c(sb, this._l_1l__, ')');
        }
    }

    private final boolean I__1l(byte[] bArr) {
        return bArr.length >= 2 && bArr[bArr.length - 2] == 105 && bArr[bArr.length - 1] == -123;
    }

    private final List<Pair<Integer, Integer>> _1__(byte[] bArr) {
        if (bArr == null || bArr.length % 4 != 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bArr.length; i += 4) {
            int i2 = (bArr[i] & UByte.MAX_VALUE) >> 3;
            int i3 = bArr[i + 1] & UByte.MAX_VALUE;
            int i4 = bArr[i + 2] & UByte.MAX_VALUE;
            if (i2 > 0 && i4 >= i3 && i4 <= 16 && i3 <= i4) {
                while (true) {
                    arrayList.add(TuplesKt.to(Integer.valueOf(i2), Integer.valueOf(i3)));
                    if (i3 != i4) {
                        i3++;
                    }
                }
            }
        }
        return arrayList;
    }

    private final byte[] __l1_(byte[] bArr) {
        return l$1_I$l$(l$1_I$l$(bArr), "9F38");
    }

    private final boolean _l_1l__(byte[] bArr) {
        return bArr.length >= 2 && bArr[bArr.length - 2] == -112 && bArr[bArr.length - 1] == 0;
    }

    private final byte[] _llI(byte[] bArr) {
        return (bArr.length >= 2 && bArr[bArr.length - 2] == -112 && bArr[bArr.length + (-1)] == 0) ? ArraysKt.copyOfRange(bArr, 0, bArr.length - 2) : bArr;
    }

    private final boolean l$1_I$l$(byte[] bArr, String str) {
        Triple<String, Integer, Boolean> l$1_I$l$;
        boolean equals;
        int i = 0;
        while (i < bArr.length && (l$1_I$l$ = l$1_I$l$(bArr, i)) != null) {
            String component1 = l$1_I$l$.component1();
            int intValue = l$1_I$l$.component2().intValue();
            equals = StringsKt__StringsJVMKt.equals(component1, str, true);
            if (equals) {
                return true;
            }
            Pair<Integer, Integer> __l1_ = __l1_(bArr, i + intValue);
            if (__l1_ == null) {
                break;
            }
            i += __l1_.component2().intValue() + intValue;
        }
        return false;
    }

    public final byte[] extractAidFromPpse(byte[] response) {
        Intrinsics.checkNotNullParameter(response, "response");
        byte[] l$1_I$l$ = l$1_I$l$(l$1_I$l$(response), "4F");
        if (l$1_I$l$ == null) {
            return null;
        }
        return l$1_I$l$;
    }

    public final byte[] hexToByteArray(String str) {
        List chunked;
        int collectionSizeOrDefault;
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(str, "<this>");
        chunked = StringsKt___StringsKt.chunked(str, 2);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = chunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        return byteArray;
    }

    public final CardData parseTlv(byte[] data) {
        String hexString;
        Intrinsics.checkNotNullParameter(data, "data");
        List<Tlv> l$1_I$l$ = l$1_I$l$(data);
        byte[] l$1_I$l$2 = l$1_I$l$(l$1_I$l$, "57");
        if (l$1_I$l$2 != null) {
            return l$1_I$l$(toHexString(l$1_I$l$2));
        }
        byte[] l$1_I$l$3 = l$1_I$l$(l$1_I$l$, "5A");
        String str = null;
        if (l$1_I$l$3 == null) {
            return null;
        }
        byte[] l$1_I$l$4 = l$1_I$l$(l$1_I$l$, "5F24");
        if (l$1_I$l$4 != null && (hexString = toHexString(l$1_I$l$4)) != null) {
            if (hexString.length() < 4) {
                hexString = null;
            }
            if (hexString != null) {
                str = hexString.substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        return new CardData(StringsKt.trimEnd(toHexString(l$1_I$l$3), 'F'), str);
    }

    public final CardData startCardScanner(Tag tag) {
        byte[] bArr;
        byte[] selectResp;
        int collectionSizeOrDefault;
        IsoDep isoDep = IsoDep.get(tag);
        if (isoDep == null) {
            return null;
        }
        try {
            isoDep.connect();
            isoDep.setTimeout(5000);
            EmvCommands emvCommands = EmvCommands.INSTANCE;
            byte[] ppseResponse = isoDep.transceive(emvCommands.getSELECT_PPSE());
            Intrinsics.checkNotNullExpressionValue(ppseResponse, "ppseResponse");
            byte[] extractAidFromPpse = extractAidFromPpse(ppseResponse);
            Iterator<byte[]> it = (extractAidFromPpse != null ? CollectionsKt.listOf(extractAidFromPpse) : emvCommands.getKNOWN_AIDS()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    bArr = null;
                    selectResp = null;
                    break;
                }
                bArr = it.next();
                selectResp = isoDep.transceive(EmvCommands.INSTANCE.selectAid(bArr));
                Intrinsics.checkNotNullExpressionValue(selectResp, "selectResp");
                if (_l_1l__(selectResp)) {
                    break;
                }
            }
            if (bArr == null) {
                isoDep.close();
                return null;
            }
            byte[] __l1_ = selectResp != null ? __l1_(selectResp) : null;
            byte[] l$1_I$l$ = l$1_I$l$(__l1_, false);
            EmvCommands emvCommands2 = EmvCommands.INSTANCE;
            byte[] gpoResp = isoDep.transceive(emvCommands2.getProcessingOptions(l$1_I$l$));
            if (__l1_ != null ? l$1_I$l$(__l1_, "9F6E") : false) {
                Intrinsics.checkNotNullExpressionValue(gpoResp, "gpoResp");
                if (I__1l(gpoResp)) {
                    gpoResp = isoDep.transceive(emvCommands2.getProcessingOptions(l$1_I$l$(__l1_, true)));
                }
            }
            Intrinsics.checkNotNullExpressionValue(gpoResp, "gpoResp");
            List<Pair<Integer, Integer>> _1__ = _1__(l$1_I$l$(l$1_I$l$(gpoResp)));
            if (_1__.isEmpty()) {
                IntRange intRange = new IntRange(1, 3);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    int nextInt = ((IntIterator) it2).nextInt();
                    IntRange intRange2 = new IntRange(1, 3);
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    Iterator<Integer> it3 = intRange2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(TuplesKt.to(Integer.valueOf(nextInt), Integer.valueOf(((IntIterator) it3).nextInt())));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
                }
                _1__ = arrayList;
            }
            for (Pair<Integer, Integer> pair : _1__) {
                byte[] response = isoDep.transceive(EmvCommands.INSTANCE.readRecord(pair.component2().intValue(), pair.component1().intValue()));
                if (response.length > 2 && response[response.length - 2] == -112) {
                    Intrinsics.checkNotNullExpressionValue(response, "response");
                    CardData parseTlv = parseTlv(response);
                    if (parseTlv != null) {
                        isoDep.close();
                        return parseTlv;
                    }
                }
            }
            isoDep.close();
            return null;
        } catch (Exception unused) {
            isoDep.close();
            return null;
        } catch (Throwable th) {
            isoDep.close();
            throw th;
        }
    }

    public final String toHexString(byte[] bArr) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.razorpay.nfc.NfcHelper$toHexString$1
            public final CharSequence invoke(byte b) {
                return p.a(new Object[]{Byte.valueOf(b)}, 1, "%02X", "format(this, *args)");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
        return joinToString$default;
    }

    private final Pair<Integer, Integer> __l1_(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return null;
        }
        int i2 = bArr[i];
        int i3 = i2 & 255;
        if ((i2 & 128) == 0) {
            return TuplesKt.to(Integer.valueOf(i3), 1);
        }
        int i4 = i2 & 127;
        if (i + i4 >= bArr.length) {
            return null;
        }
        int i5 = 0;
        if (1 <= i4) {
            int i6 = 1;
            while (true) {
                i5 = (i5 << 8) | (bArr[i + i6] & UByte.MAX_VALUE);
                if (i6 == i4) {
                    break;
                }
                i6++;
            }
        }
        return TuplesKt.to(Integer.valueOf(i5), Integer.valueOf(i4 + 1));
    }

    private final CardData l$1_I$l$(String str) {
        List split$default;
        String str2;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"D"}, false, 0, 6, (Object) null);
        String trimEnd = StringsKt.trimEnd((String) split$default.get(0), 'F');
        if (split$default.size() <= 1 || ((String) split$default.get(1)).length() < 4) {
            str2 = null;
        } else {
            str2 = ((String) split$default.get(1)).substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return new CardData(trimEnd, str2);
    }

    private final byte[] __l1_(int i) {
        List chunked;
        int collectionSizeOrDefault;
        byte[] byteArray;
        byte[] byteArray2;
        try {
            String format = new SimpleDateFormat("yyMMdd", Locale.US).format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "sdf.format(Date())");
            chunked = StringsKt___StringsKt.chunked(format, 2);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = chunked.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
            }
            byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
            if (byteArray.length >= i) {
                byteArray2 = CollectionsKt___CollectionsKt.toByteArray(ArraysKt.take(byteArray, i));
                return byteArray2;
            }
            int length = i - byteArray.length;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = 0;
            }
            return ArraysKt.plus(byteArray, bArr);
        } catch (Exception unused) {
            byte[] bArr2 = new byte[i];
            for (int i3 = 0; i3 < i; i3++) {
                bArr2[i3] = 0;
            }
            return bArr2;
        }
    }

    private final List<Tlv> l$1_I$l$(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        l$1_I$l$(this, arrayList, _llI(bArr));
        return arrayList;
    }

    private static final void l$1_I$l$(NfcHelper nfcHelper, List<Tlv> list, byte[] bArr) {
        Triple<String, Integer, Boolean> l$1_I$l$;
        int i = 0;
        while (i < bArr.length && (l$1_I$l$ = nfcHelper.l$1_I$l$(bArr, i)) != null) {
            String component1 = l$1_I$l$.component1();
            int intValue = l$1_I$l$.component2().intValue();
            boolean booleanValue = l$1_I$l$.component3().booleanValue();
            int i2 = i + intValue;
            Pair<Integer, Integer> __l1_ = nfcHelper.__l1_(bArr, i2);
            if (__l1_ == null) {
                return;
            }
            int intValue2 = __l1_.component1().intValue();
            int intValue3 = __l1_.component2().intValue() + i2;
            i = intValue3 + intValue2;
            if (intValue2 < 0 || i > bArr.length) {
                return;
            }
            byte[] copyOfRange = ArraysKt.copyOfRange(bArr, intValue3, i);
            list.add(new Tlv(component1, intValue2, copyOfRange, booleanValue));
            if (booleanValue) {
                l$1_I$l$(nfcHelper, list, copyOfRange);
            }
        }
    }

    private final Triple<String, Integer, Boolean> l$1_I$l$(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return null;
        }
        byte b = bArr[i];
        int i2 = 1;
        boolean z = (b & 32) == 32;
        byte[] bArr2 = {b};
        if ((b & 31) == 31) {
            int i3 = i + 1;
            while (i3 < bArr.length) {
                bArr2 = ArraysKt.plus(bArr2, bArr[i3]);
                i2++;
                byte b2 = bArr[i3];
                i3++;
                if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                    break;
                }
            }
        }
        return new Triple<>(toHexString(bArr2), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0208 A[LOOP:8: B:106:0x0206->B:107:0x0208, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] l$1_I$l$(byte[] bArr, boolean z) {
        byte[] byteArray;
        Triple<String, Integer, Boolean> l$1_I$l$;
        byte[] bArr2;
        int i;
        if (bArr != null && bArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            SecureRandom secureRandom = new SecureRandom();
            int i2 = 0;
            while (i2 < bArr.length && (l$1_I$l$ = l$1_I$l$(bArr, i2)) != null) {
                String component1 = l$1_I$l$.component1();
                int intValue = l$1_I$l$.component2().intValue() + i2;
                if (intValue < bArr.length) {
                    int i3 = bArr[intValue] & 255;
                    int i4 = intValue + 1;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String upperCase = component1.toUpperCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    switch (upperCase.hashCode()) {
                        case 1820:
                            if (upperCase.equals("95")) {
                                bArr2 = new byte[i3];
                                for (int i5 = 0; i5 < i3; i5++) {
                                    bArr2[i5] = 0;
                                }
                                break;
                            }
                            bArr2 = new byte[i3];
                            for (i = 0; i < i3; i++) {
                                bArr2[i] = 0;
                            }
                            break;
                        case 1832:
                            if (upperCase.equals("9A")) {
                                bArr2 = __l1_(i3);
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1834:
                            if (upperCase.equals("9C")) {
                                bArr2 = new byte[]{0};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1647808:
                            if (upperCase.equals("5F2A")) {
                                bArr2 = new byte[]{3, 86};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766895:
                            if (upperCase.equals("9F02")) {
                                bArr2 = new byte[i3];
                                for (int i6 = 0; i6 < i3; i6++) {
                                    bArr2[i6] = 0;
                                }
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766896:
                            if (upperCase.equals("9F03")) {
                                bArr2 = new byte[i3];
                                for (int i7 = 0; i7 < i3; i7++) {
                                    bArr2[i7] = 0;
                                }
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766902:
                            if (upperCase.equals("9F09")) {
                                bArr2 = new byte[]{0, 2};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766929:
                            if (upperCase.equals("9F15")) {
                                bArr2 = new byte[]{0, 0};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766941:
                            if (upperCase.equals("9F1A")) {
                                bArr2 = new byte[]{3, 86};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766943:
                            if (upperCase.equals("9F1C")) {
                                byte[] bytes = "00000001".getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                                byte[] copyOf = Arrays.copyOf(bytes, i3);
                                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                                ArrayList arrayList2 = new ArrayList(copyOf.length);
                                for (byte b : copyOf) {
                                    arrayList2.add(Byte.valueOf(b));
                                }
                                bArr2 = CollectionsKt___CollectionsKt.toByteArray(arrayList2);
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766956:
                            if (upperCase.equals("9F21")) {
                                bArr2 = l$1_I$l$(i3);
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766989:
                            if (upperCase.equals("9F33")) {
                                bArr2 = new byte[]{-32, -16, -56};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766991:
                            if (upperCase.equals("9F35")) {
                                bArr2 = new byte[1];
                                if (z) {
                                    bArr2[0] = 20;
                                    break;
                                } else {
                                    bArr2[0] = 34;
                                    break;
                                }
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1766993:
                            if (upperCase.equals("9F37")) {
                                bArr2 = new byte[i3];
                                secureRandom.nextBytes(bArr2);
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1767017:
                            if (upperCase.equals("9F40")) {
                                bArr2 = new byte[]{96, 0, -64, ByteCompanionObject.MIN_VALUE, 0};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1767085:
                            if (upperCase.equals("9F66")) {
                                bArr2 = new byte[]{55, 0, 64, 0};
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 1767100:
                            if (upperCase.equals("9F6E")) {
                                bArr2 = new byte[4];
                                if (z) {
                                    bArr2[0] = 54;
                                    bArr2[1] = 0;
                                    bArr2[2] = 64;
                                    bArr2[3] = 0;
                                    break;
                                } else {
                                    bArr2[0] = 32;
                                    bArr2[1] = 0;
                                    bArr2[2] = -64;
                                    bArr2[3] = 0;
                                    break;
                                }
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 2094631:
                            if (upperCase.equals("DF16")) {
                                bArr2 = new byte[i3];
                                for (int i8 = 0; i8 < i3; i8++) {
                                    bArr2[i8] = 0;
                                }
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        case 2094704:
                            if (upperCase.equals("DF3A")) {
                                bArr2 = new byte[i3];
                                for (int i9 = 0; i9 < i3; i9++) {
                                    bArr2[i9] = 0;
                                }
                                break;
                            }
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                        default:
                            bArr2 = new byte[i3];
                            while (i < i3) {
                            }
                            break;
                    }
                    if (bArr2.length < i3) {
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList, ArraysKt.asIterable(bArr2));
                        int length = i3 - bArr2.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            arrayList.add((byte) 0);
                        }
                    } else {
                        arrayList.addAll(ArraysKt.take(bArr2, i3));
                    }
                    i2 = i4;
                }
            }
            byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
            return byteArray;
        }
        return new byte[0];
    }

    private final byte[] l$1_I$l$(int i) {
        List chunked;
        int collectionSizeOrDefault;
        byte[] byteArray;
        byte[] byteArray2;
        try {
            String format = new SimpleDateFormat("HHmmss", Locale.US).format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "sdf.format(Date())");
            chunked = StringsKt___StringsKt.chunked(format, 2);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = chunked.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
            }
            byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
            if (byteArray.length >= i) {
                byteArray2 = CollectionsKt___CollectionsKt.toByteArray(ArraysKt.take(byteArray, i));
                return byteArray2;
            }
            int length = i - byteArray.length;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = 0;
            }
            return ArraysKt.plus(byteArray, bArr);
        } catch (Exception unused) {
            byte[] bArr2 = new byte[i];
            for (int i3 = 0; i3 < i; i3++) {
                bArr2[i3] = 0;
            }
            return bArr2;
        }
    }

    private final byte[] l$1_I$l$(List<Tlv> list) {
        byte[] l$1_I$l$ = l$1_I$l$(list, "94");
        if (l$1_I$l$ != null) {
            return l$1_I$l$;
        }
        byte[] l$1_I$l$2 = l$1_I$l$(list, "80");
        if (l$1_I$l$2 == null || l$1_I$l$2.length <= 2) {
            return null;
        }
        return ArraysKt.copyOfRange(l$1_I$l$2, 2, l$1_I$l$2.length);
    }

    private final byte[] l$1_I$l$(List<Tlv> list, String str) {
        Object obj;
        boolean equals;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            equals = StringsKt__StringsJVMKt.equals(((Tlv) obj).getTag(), str, true);
            if (equals) {
                break;
            }
        }
        Tlv tlv = (Tlv) obj;
        if (tlv != null) {
            return tlv.getValue();
        }
        return null;
    }
}
