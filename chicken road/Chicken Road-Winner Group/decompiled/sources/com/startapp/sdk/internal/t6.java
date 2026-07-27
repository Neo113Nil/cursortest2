package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public abstract class t6 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public float f4359a;

    /* renamed from: b, reason: collision with root package name */
    public float f4360b;

    /* renamed from: c, reason: collision with root package name */
    public float f4361c;

    /* renamed from: d, reason: collision with root package name */
    public float f4362d;

    /* renamed from: e, reason: collision with root package name */
    public long f4363e;

    public t6() {
        this.f4361c = Float.MAX_VALUE;
        this.f4362d = -3.4028235E38f;
        this.f4363e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f4359a);
        parcel.writeFloat(this.f4360b);
        parcel.writeFloat(this.f4361c);
        parcel.writeFloat(this.f4362d);
    }

    public t6(Parcel parcel) {
        this.f4361c = Float.MAX_VALUE;
        this.f4362d = -3.4028235E38f;
        this.f4363e = 0L;
        this.f4359a = parcel.readFloat();
        this.f4360b = parcel.readFloat();
        this.f4361c = parcel.readFloat();
        this.f4362d = parcel.readFloat();
        this.f4363e = AnimationUtils.currentAnimationTimeMillis();
    }
}
