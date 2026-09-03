package com.door.brass.knob.data.db.entity;

import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/entity/TipEntity;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TipEntity {
    public final boolean b41X89IqSbKt;
    public final String hRNgd2zGCE5kj;
    public final String oyjLVtGms9eZwJ0;
    public final String ra306ClFT3HT;
    public final long yzPsTade5rL7D3;

    public TipEntity(long j, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.yzPsTade5rL7D3 = j;
        this.hRNgd2zGCE5kj = str;
        this.ra306ClFT3HT = str2;
        this.oyjLVtGms9eZwJ0 = str3;
        this.b41X89IqSbKt = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TipEntity)) {
            return false;
        }
        TipEntity tipEntity = (TipEntity) obj;
        return this.yzPsTade5rL7D3 == tipEntity.yzPsTade5rL7D3 && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, tipEntity.hRNgd2zGCE5kj) && Intrinsics.yzPsTade5rL7D3(this.ra306ClFT3HT, tipEntity.ra306ClFT3HT) && Intrinsics.yzPsTade5rL7D3(this.oyjLVtGms9eZwJ0, tipEntity.oyjLVtGms9eZwJ0) && this.b41X89IqSbKt == tipEntity.b41X89IqSbKt;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b41X89IqSbKt) + j8.hRNgd2zGCE5kj(this.oyjLVtGms9eZwJ0, j8.hRNgd2zGCE5kj(this.ra306ClFT3HT, j8.hRNgd2zGCE5kj(this.hRNgd2zGCE5kj, Long.hashCode(this.yzPsTade5rL7D3) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TipEntity(id=" + this.yzPsTade5rL7D3 + ", title=" + this.hRNgd2zGCE5kj + ", content=" + this.ra306ClFT3HT + ", category=" + this.oyjLVtGms9eZwJ0 + ", isFavorite=" + this.b41X89IqSbKt + ")";
    }
}
