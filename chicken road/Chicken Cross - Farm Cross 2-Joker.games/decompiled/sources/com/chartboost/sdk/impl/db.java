package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    public final String f4728a;
    public final List b;
    public final bk c;
    public final List d;
    public final List e;

    public db(String str, List trackingEvents, bk bkVar, List mediaFiles, List icons) {
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f4728a = str;
        this.b = trackingEvents;
        this.c = bkVar;
        this.d = mediaFiles;
        this.e = icons;
    }

    public final db a(String str, List trackingEvents, bk bkVar, List mediaFiles, List icons) {
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new db(str, trackingEvents, bkVar, mediaFiles, icons);
    }

    public final List b() {
        return this.b;
    }

    public final bk c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return Intrinsics.areEqual(this.f4728a, dbVar.f4728a) && Intrinsics.areEqual(this.b, dbVar.b) && Intrinsics.areEqual(this.c, dbVar.c) && Intrinsics.areEqual(this.d, dbVar.d) && Intrinsics.areEqual(this.e, dbVar.e);
    }

    public int hashCode() {
        String str = this.f4728a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        bk bkVar = this.c;
        return ((((hashCode + (bkVar != null ? bkVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "Linear(duration=" + this.f4728a + ", trackingEvents=" + this.b + ", videoClicks=" + this.c + ", mediaFiles=" + this.d + ", icons=" + this.e + ")";
    }

    public static /* synthetic */ db a(db dbVar, String str, List list, bk bkVar, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dbVar.f4728a;
        }
        if ((i & 2) != 0) {
            list = dbVar.b;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            bkVar = dbVar.c;
        }
        bk bkVar2 = bkVar;
        if ((i & 8) != 0) {
            list2 = dbVar.d;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = dbVar.e;
        }
        return dbVar.a(str, list4, bkVar2, list5, list3);
    }

    public final List a() {
        return this.d;
    }
}
