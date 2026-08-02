package com.razorpay.nfc;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006¨\u0006#"}, d2 = {"Lcom/razorpay/nfc/EmvCommands;", "", "()V", "AMEX_AID", "", "getAMEX_AID", "()[B", "DINERS_DISCOVER_AID", "getDINERS_DISCOVER_AID", "KNOWN_AIDS", "", "getKNOWN_AIDS", "()Ljava/util/List;", "MASTERCARD_AID", "getMASTERCARD_AID", "RUPAY_AID", "getRUPAY_AID", "RUPAY_AID_ALT_1", "getRUPAY_AID_ALT_1", "RUPAY_AID_ALT_2", "getRUPAY_AID_ALT_2", "RUPAY_AID_ALT_3", "getRUPAY_AID_ALT_3", "SELECT_PPSE", "getSELECT_PPSE", "VISA_AID", "getVISA_AID", "getProcessingOptions", "pdolData", "readRecord", "record", "", "sfi", "selectAid", "aid", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmvCommands {
    private static final byte[] $I__I;
    private static final byte[] $l$I1I11I1;
    private static final byte[] I__1l;
    private static final byte[] _1__;
    private static final byte[] __l1_;
    private static final byte[] _l_1l__;
    private static final byte[] _llI;
    private static final byte[] l$1_I$l$;
    private static final List<byte[]> lI_l1Il_;
    public static final EmvCommands INSTANCE = new EmvCommands();
    private static final byte[] _$_l_$1l$ = {0, -92, 4, 0, 14, 50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, 49, 0};

    static {
        byte[] bArr = {-96, 0, 0, 0, 3, 16, 16};
        l$1_I$l$ = bArr;
        byte[] bArr2 = {-96, 0, 0, 0, 4, 16, 16};
        __l1_ = bArr2;
        byte[] bArr3 = {-96, 0, 0, 0, 37, 1, 0};
        _llI = bArr3;
        byte[] bArr4 = {-96, 0, 0, 1, 82, 48, 16};
        _l_1l__ = bArr4;
        byte[] bArr5 = {-96, 0, 0, 5, 36, 16, 16};
        I__1l = bArr5;
        byte[] bArr6 = {-96, 0, 0, 5, 36, 32, 16};
        _1__ = bArr6;
        byte[] bArr7 = {-96, 0, 0, 5, 36, 48, 16};
        $I__I = bArr7;
        byte[] bArr8 = {-96, 0, 0, 5, 36, 64, 16};
        $l$I1I11I1 = bArr8;
        lI_l1Il_ = CollectionsKt.listOf((Object[]) new byte[][]{bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8});
    }

    private EmvCommands() {
    }

    public static /* synthetic */ byte[] getProcessingOptions$default(EmvCommands emvCommands, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = new byte[0];
        }
        return emvCommands.getProcessingOptions(bArr);
    }

    public final byte[] getAMEX_AID() {
        return _llI;
    }

    public final byte[] getDINERS_DISCOVER_AID() {
        return _l_1l__;
    }

    public final List<byte[]> getKNOWN_AIDS() {
        return lI_l1Il_;
    }

    public final byte[] getMASTERCARD_AID() {
        return __l1_;
    }

    public final byte[] getProcessingOptions(byte[] pdolData) {
        Intrinsics.checkNotNullParameter(pdolData, "pdolData");
        byte[] plus = ArraysKt.plus(new byte[]{-125, (byte) pdolData.length}, pdolData);
        return ArraysKt.plus(ArraysKt.plus(new byte[]{ByteCompanionObject.MIN_VALUE, -88, 0, 0, (byte) plus.length}, plus), (byte) 0);
    }

    public final byte[] getRUPAY_AID() {
        return I__1l;
    }

    public final byte[] getRUPAY_AID_ALT_1() {
        return _1__;
    }

    public final byte[] getRUPAY_AID_ALT_2() {
        return $I__I;
    }

    public final byte[] getRUPAY_AID_ALT_3() {
        return $l$I1I11I1;
    }

    public final byte[] getSELECT_PPSE() {
        return _$_l_$1l$;
    }

    public final byte[] getVISA_AID() {
        return l$1_I$l$;
    }

    public final byte[] readRecord(int record, int sfi) {
        return new byte[]{0, -78, (byte) record, (byte) ((sfi << 3) | 4), 0};
    }

    public final byte[] selectAid(byte[] aid) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(new byte[]{0, -92, 4, 0}, (byte) aid.length), aid), (byte) 0);
    }
}
