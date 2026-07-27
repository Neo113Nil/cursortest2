package com.startapp.sdk.internal;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3670a;

    public f1(Context context, AttributeSet attributeSet) {
        String str = null;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "adTag", -1);
            str = attributeResourceValue != -1 ? context.getResources().getString(attributeResourceValue) : attributeSet.getAttributeValue(null, "adTag");
        } catch (Exception unused) {
        }
        this.f3670a = str;
    }
}
