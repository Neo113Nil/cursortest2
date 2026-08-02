package com.plaid.internal;

/* loaded from: classes16.dex */
public final class T extends retrofit2.CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public final retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(retrofit2.Call.class, retrofit2.CallAdapter.Factory.getRawType(type))) {
            return null;
        }
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
        }
        java.lang.reflect.Type parameterUpperBound = retrofit2.CallAdapter.Factory.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(retrofit2.CallAdapter.Factory.getRawType(parameterUpperBound), com.plaid.internal.AbstractC0550i4.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof java.lang.reflect.ParameterizedType)) {
            throw new java.lang.IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) parameterUpperBound;
        java.lang.reflect.Type parameterUpperBound2 = retrofit2.CallAdapter.Factory.getParameterUpperBound(0, parameterizedType);
        retrofit2.Converter nextResponseBodyConverter = retrofit.nextResponseBodyConverter(null, retrofit2.CallAdapter.Factory.getParameterUpperBound(1, parameterizedType), annotationArr);
        kotlin.jvm.internal.Intrinsics.checkNotNull(parameterUpperBound2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(nextResponseBodyConverter);
        return new com.plaid.internal.S(parameterUpperBound2, nextResponseBodyConverter);
    }
}
