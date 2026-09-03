package com.door.brass.knob.data.db.entity;

import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/entity/MenuItemEntity;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MenuItemEntity {
    public final String Uo5pffGf8LUU;
    public final String b41X89IqSbKt;
    public final String gmXBnHsR2YSm;
    public final String hRNgd2zGCE5kj;
    public final String i7xAcZoXXiIt;
    public final String oyjLVtGms9eZwJ0;
    public final String ra306ClFT3HT;
    public final long yzPsTade5rL7D3;

    public MenuItemEntity(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.yzPsTade5rL7D3 = j;
        this.hRNgd2zGCE5kj = str;
        this.ra306ClFT3HT = str2;
        this.oyjLVtGms9eZwJ0 = str3;
        this.b41X89IqSbKt = str4;
        this.gmXBnHsR2YSm = str5;
        this.i7xAcZoXXiIt = str6;
        this.Uo5pffGf8LUU = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemEntity)) {
            return false;
        }
        MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
        return this.yzPsTade5rL7D3 == menuItemEntity.yzPsTade5rL7D3 && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, menuItemEntity.hRNgd2zGCE5kj) && Intrinsics.yzPsTade5rL7D3(this.ra306ClFT3HT, menuItemEntity.ra306ClFT3HT) && Intrinsics.yzPsTade5rL7D3(this.oyjLVtGms9eZwJ0, menuItemEntity.oyjLVtGms9eZwJ0) && Intrinsics.yzPsTade5rL7D3(this.b41X89IqSbKt, menuItemEntity.b41X89IqSbKt) && Intrinsics.yzPsTade5rL7D3(this.gmXBnHsR2YSm, menuItemEntity.gmXBnHsR2YSm) && Intrinsics.yzPsTade5rL7D3(this.i7xAcZoXXiIt, menuItemEntity.i7xAcZoXXiIt) && Intrinsics.yzPsTade5rL7D3(this.Uo5pffGf8LUU, menuItemEntity.Uo5pffGf8LUU);
    }

    public final int hashCode() {
        int hRNgd2zGCE5kj = j8.hRNgd2zGCE5kj(this.oyjLVtGms9eZwJ0, j8.hRNgd2zGCE5kj(this.ra306ClFT3HT, j8.hRNgd2zGCE5kj(this.hRNgd2zGCE5kj, Long.hashCode(this.yzPsTade5rL7D3) * 31, 31), 31), 31);
        String str = this.b41X89IqSbKt;
        return this.Uo5pffGf8LUU.hashCode() + j8.hRNgd2zGCE5kj(this.i7xAcZoXXiIt, j8.hRNgd2zGCE5kj(this.gmXBnHsR2YSm, (hRNgd2zGCE5kj + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "MenuItemEntity(id=" + this.yzPsTade5rL7D3 + ", name=" + this.hRNgd2zGCE5kj + ", category=" + this.ra306ClFT3HT + ", description=" + this.oyjLVtGms9eZwJ0 + ", ingredients=" + this.b41X89IqSbKt + ", sweetness=" + this.gmXBnHsR2YSm + ", texture=" + this.i7xAcZoXXiIt + ", tags=" + this.Uo5pffGf8LUU + ")";
    }
}
