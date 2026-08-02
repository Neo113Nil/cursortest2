package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class T3 extends AbstractC1600tD {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11620s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T3(String str, int i) {
        super(str);
        this.f11620s = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1600tD
    public final void c(ByteBuffer byteBuffer) {
        switch (this.f11620s) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
