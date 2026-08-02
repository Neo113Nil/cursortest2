package com.google.android.gms.internal.p000authapi;

/* loaded from: classes4.dex */
final class zbbg extends zbbe {
    private final zbbi zba;

    public zbbg(zbbi zbbiVar, int i) {
        super(zbbiVar.size(), i);
        this.zba = zbbiVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbe
    public final Object zba(int i) {
        return this.zba.get(i);
    }
}
