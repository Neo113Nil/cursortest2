package com.google.gson.internal;

/* loaded from: classes4.dex */
public abstract class JsonReaderInternalAccess {
    public static volatile com.google.gson.internal.JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException;
}
