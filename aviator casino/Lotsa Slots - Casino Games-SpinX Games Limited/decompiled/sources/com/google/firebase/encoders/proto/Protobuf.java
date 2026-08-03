package com.google.firebase.encoders.proto;

@com.google.firebase.encoders.annotations.ExtraProperty
/* loaded from: classes3.dex */
public @interface Protobuf {

    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding() default com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT;

    int tag();
}
