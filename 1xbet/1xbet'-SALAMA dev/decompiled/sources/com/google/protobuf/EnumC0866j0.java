package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0866j0 implements H {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12211a;

    EnumC0866j0(int i7) {
        this.f12211a = i7;
    }

    @Override // com.google.protobuf.H
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f12211a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
