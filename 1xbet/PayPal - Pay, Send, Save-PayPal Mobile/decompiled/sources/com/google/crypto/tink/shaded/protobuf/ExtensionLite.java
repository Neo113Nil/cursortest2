package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public abstract class ExtensionLite<ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType();

    public abstract com.google.crypto.tink.shaded.protobuf.MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
