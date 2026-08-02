package util.h.xy.aj;

/* loaded from: classes18.dex */
public final class a implements util.h.xy.aj.ra {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    @Override // util.h.xy.aj.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.aj.ra.mb mo24950() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 119) + ((i & 119) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        getHighSpeedVideoSizes = (i2 + 73) % 128;
        return null;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo24952() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 13) + (i | 13);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.v.a.f2437.m27571();
            int i3 = getHighSpeedVideoSizes + 101;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        util.h.xy.v.a.f2437.m27571();
        throw null;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.sun.jna.Pointer mo24955(com.sun.jna.Pointer pointer, java.lang.String str) {
        com.sun.jna.ptr.PointerByReference pointerByReference = new com.sun.jna.ptr.PointerByReference();
        util.h.xy.v.a.f2437.m27559(pointerByReference, pointer, str);
        com.sun.jna.Pointer value = pointerByReference.getValue();
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 119) << 1) - (i ^ 119)) % 128;
        return value;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.sun.jna.Pointer mo24949(com.sun.jna.Pointer pointer, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, util.h.xy.aj.ra.mb mbVar) {
        com.sun.jna.ptr.PointerByReference pointerByReference = new com.sun.jna.ptr.PointerByReference();
        util.h.xy.v.a.f2437.m27556(pointerByReference, pointer, str, str2, str3, i, mbVar);
        com.sun.jna.Pointer value = pointerByReference.getValue();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 45) % 128;
        return value;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final int mo24954(com.sun.jna.Pointer pointer, int i, java.lang.String str, java.lang.String str2) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i2 & 9) + (i2 | 9)) % 128;
        int m27552 = util.h.xy.v.a.f2437.m27552(pointer, i, str, str2);
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (i3 & 99) + (i3 | 99);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return m27552;
        }
        throw null;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int mo24957(com.sun.jna.Pointer pointer, java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 15) + (i | 15)) % 128;
        int m27558 = util.h.xy.v.a.f2437.m27558(pointer, str);
        int i2 = getHighSpeedVideoSizes + 121;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return m27558;
        }
        throw null;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˊ, reason: contains not printable characters */
    public final int mo24948(com.sun.jna.Pointer pointer, int i) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 29) % 128;
        int m27562 = util.h.xy.v.a.f2437.m27562(pointer, i);
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i2 ^ 101) + ((i2 & 101) << 1)) % 128;
        return m27562;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final int mo24953(com.sun.jna.Pointer pointer, int i) {
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i2 | 69) << 1) - (i2 ^ 69)) % 128;
        int m27567 = util.h.xy.v.a.f2437.m27567(pointer, i);
        int i3 = getHighSpeedVideoSizes;
        int i4 = ((i3 | 71) << 1) - (i3 ^ 71);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return m27567;
        }
        throw null;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˎ, reason: contains not printable characters */
    public final int mo24951(com.sun.jna.Pointer pointer, int i, int i2) {
        int m27563 = util.h.xy.v.a.f2437.m27563(pointer, i, i2);
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i3 ^ 1) + ((i3 & 1) << 1)) % 128;
        return m27563;
    }

    @Override // util.h.xy.aj.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void mo24956(com.sun.jna.Pointer pointer, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 85) + (i | 85)) % 128;
        util.h.xy.v.a.f2437.m27555(pointer, str, str2, str3, str4, str5);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
