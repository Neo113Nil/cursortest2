package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class IF extends OD {

    /* renamed from: j, reason: collision with root package name */
    public long f9536j;

    /* renamed from: k, reason: collision with root package name */
    public int f9537k;

    /* renamed from: l, reason: collision with root package name */
    public int f9538l;

    @Override // com.google.android.gms.internal.ads.OD
    public final void d() {
        super.d();
        this.f9537k = 0;
    }

    public final int i() {
        return this.f9537k;
    }

    public final boolean j(OD od) {
        ByteBuffer byteBuffer;
        AbstractC1668us.S(!od.a(1073741824));
        AbstractC1668us.S(!od.a(268435456));
        AbstractC1668us.S(!od.a(4));
        if (k()) {
            if (this.f9537k >= this.f9538l) {
                return false;
            }
            ByteBuffer byteBuffer2 = od.f10938e;
            if (byteBuffer2 != null && (byteBuffer = this.f10938e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f9537k;
        this.f9537k = i + 1;
        if (i == 0) {
            this.f10939g = od.f10939g;
            if (od.a(1)) {
                this.f15911b = 1;
            }
        }
        ByteBuffer byteBuffer3 = od.f10938e;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f10938e.put(byteBuffer3);
        }
        this.f9536j = od.f10939g;
        return true;
    }

    public final boolean k() {
        return this.f9537k > 0;
    }
}
