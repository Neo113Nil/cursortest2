package com.startapp.sdk.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3860a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3861b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3862c;

    /* renamed from: d, reason: collision with root package name */
    public String f3863d;

    public final i9 a(String... strArr) {
        ArrayList arrayList = this.f3862c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f3862c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
