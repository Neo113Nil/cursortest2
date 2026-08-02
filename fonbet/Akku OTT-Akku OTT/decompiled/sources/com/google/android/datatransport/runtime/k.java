package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;

@Encodable
/* loaded from: classes.dex */
public abstract class k {
    public static final ProtobufEncoder a = ProtobufEncoder.builder().configureWith(a.a).build();

    public abstract com.google.android.datatransport.runtime.firebase.transport.a a();
}
