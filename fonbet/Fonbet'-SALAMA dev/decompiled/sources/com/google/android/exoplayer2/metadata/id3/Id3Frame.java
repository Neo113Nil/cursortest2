package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f10625a;

    public Id3Frame(String str) {
        this.f10625a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f10625a;
    }
}
