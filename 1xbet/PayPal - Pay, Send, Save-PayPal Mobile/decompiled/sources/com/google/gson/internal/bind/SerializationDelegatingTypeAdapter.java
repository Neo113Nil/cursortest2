package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public abstract class SerializationDelegatingTypeAdapter<T> extends com.google.gson.TypeAdapter<T> {
    public abstract com.google.gson.TypeAdapter<T> getSerializationDelegate();
}
