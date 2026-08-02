package com.google.gson;

/* loaded from: classes4.dex */
public interface TypeAdapterFactory {
    <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken);
}
