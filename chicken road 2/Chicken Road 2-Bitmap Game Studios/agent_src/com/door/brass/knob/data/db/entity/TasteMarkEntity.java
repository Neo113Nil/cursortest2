package com.door.brass.knob.data.db.entity;

import defpackage.OcGJUxcOVecQiKb;
import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/entity/TasteMarkEntity;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TasteMarkEntity {
    public final long b41X89IqSbKt;
    public final long hRNgd2zGCE5kj;
    public final String oyjLVtGms9eZwJ0;
    public final String ra306ClFT3HT;
    public final long yzPsTade5rL7D3;

    public TasteMarkEntity(long j, long j2, String str, String str2, long j3) {
        str.getClass();
        str2.getClass();
        this.yzPsTade5rL7D3 = j;
        this.hRNgd2zGCE5kj = j2;
        this.ra306ClFT3HT = str;
        this.oyjLVtGms9eZwJ0 = str2;
        this.b41X89IqSbKt = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TasteMarkEntity)) {
            return false;
        }
        TasteMarkEntity tasteMarkEntity = (TasteMarkEntity) obj;
        return this.yzPsTade5rL7D3 == tasteMarkEntity.yzPsTade5rL7D3 && this.hRNgd2zGCE5kj == tasteMarkEntity.hRNgd2zGCE5kj && Intrinsics.yzPsTade5rL7D3(this.ra306ClFT3HT, tasteMarkEntity.ra306ClFT3HT) && Intrinsics.yzPsTade5rL7D3(this.oyjLVtGms9eZwJ0, tasteMarkEntity.oyjLVtGms9eZwJ0) && this.b41X89IqSbKt == tasteMarkEntity.b41X89IqSbKt;
    }

    public final int hashCode() {
        return Long.hashCode(this.b41X89IqSbKt) + j8.hRNgd2zGCE5kj(this.oyjLVtGms9eZwJ0, j8.hRNgd2zGCE5kj(this.ra306ClFT3HT, OcGJUxcOVecQiKb.ra306ClFT3HT(Long.hashCode(this.yzPsTade5rL7D3) * 31, 31, this.hRNgd2zGCE5kj), 31), 31);
    }

    public final String toString() {
        return "TasteMarkEntity(id=" + this.yzPsTade5rL7D3 + ", menuItemId=" + this.hRNgd2zGCE5kj + ", value=" + this.ra306ClFT3HT + ", label=" + this.oyjLVtGms9eZwJ0 + ", timestamp=" + this.b41X89IqSbKt + ")";
    }
}
