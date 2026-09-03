package com.door.brass.knob.data.db.entity;

import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/entity/DessertConfigEntity;", "", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DessertConfigEntity {
    public final boolean b41X89IqSbKt;
    public final boolean gmXBnHsR2YSm;
    public final String hRNgd2zGCE5kj;
    public final boolean oyjLVtGms9eZwJ0;
    public final boolean ra306ClFT3HT;
    public final int yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/door/brass/knob/data/db/entity/DessertConfigEntity$Companion;", "", "", "SINGLETON_ID", "I", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public DessertConfigEntity(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = str;
        this.ra306ClFT3HT = z;
        this.oyjLVtGms9eZwJ0 = z2;
        this.b41X89IqSbKt = z3;
        this.gmXBnHsR2YSm = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DessertConfigEntity)) {
            return false;
        }
        DessertConfigEntity dessertConfigEntity = (DessertConfigEntity) obj;
        return this.yzPsTade5rL7D3 == dessertConfigEntity.yzPsTade5rL7D3 && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, dessertConfigEntity.hRNgd2zGCE5kj) && this.ra306ClFT3HT == dessertConfigEntity.ra306ClFT3HT && this.oyjLVtGms9eZwJ0 == dessertConfigEntity.oyjLVtGms9eZwJ0 && this.b41X89IqSbKt == dessertConfigEntity.b41X89IqSbKt && this.gmXBnHsR2YSm == dessertConfigEntity.gmXBnHsR2YSm;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.yzPsTade5rL7D3) * 31;
        String str = this.hRNgd2zGCE5kj;
        return Boolean.hashCode(this.gmXBnHsR2YSm) + j8.yzPsTade5rL7D3(j8.yzPsTade5rL7D3(j8.yzPsTade5rL7D3((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.ra306ClFT3HT), 31, this.oyjLVtGms9eZwJ0), 31, this.b41X89IqSbKt);
    }

    public final String toString() {
        return "DessertConfigEntity(id=" + this.yzPsTade5rL7D3 + ", offerUrl=" + this.hRNgd2zGCE5kj + ", showsOffer=" + this.ra306ClFT3HT + ", isZesty=" + this.oyjLVtGms9eZwJ0 + ", hasMeringue=" + this.b41X89IqSbKt + ", isSeasonal=" + this.gmXBnHsR2YSm + ")";
    }
}
