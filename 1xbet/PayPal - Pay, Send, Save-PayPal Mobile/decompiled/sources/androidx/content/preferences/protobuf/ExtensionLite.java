package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class ExtensionLite<ContainingType extends androidx.content.preferences.protobuf.MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType();

    public abstract androidx.content.preferences.protobuf.MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    public abstract boolean isRepeated();
}
