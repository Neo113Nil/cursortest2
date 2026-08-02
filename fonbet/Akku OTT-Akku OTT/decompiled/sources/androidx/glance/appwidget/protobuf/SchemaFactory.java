package androidx.glance.appwidget.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
