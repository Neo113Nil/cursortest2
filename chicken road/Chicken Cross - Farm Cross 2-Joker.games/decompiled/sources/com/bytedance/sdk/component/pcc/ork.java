package com.bytedance.sdk.component.pcc;

import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface ork {
    <T> T pcc(String str, Type type);

    <T> String pcc(T t);
}
