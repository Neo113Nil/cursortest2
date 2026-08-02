package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import p000.InterfaceC0847wo;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.a */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0107a implements InterfaceC0847wo {

    /* JADX INFO: renamed from: j */
    public final ParcelFileDescriptorRewinder$InternalRewinder f1316j;

    public C0107a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1316j = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor m985a() {
        return this.f1316j.rewind();
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: m */
    public final Object mo617m() {
        return this.f1316j.rewind();
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: d */
    public final void mo610d() {
    }
}
