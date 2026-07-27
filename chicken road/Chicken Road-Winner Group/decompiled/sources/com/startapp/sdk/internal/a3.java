package com.startapp.sdk.internal;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a3 {
    public static z2 a(String str) {
        try {
            try {
                ArrayList a3 = gb.a(new JsonReader(new StringReader(str)));
                String str2 = (String) a3.get(0);
                if (str2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String str3 = (String) a3.get(1);
                if (str3 == null) {
                    throw new IllegalArgumentException(str);
                }
                List list = (List) a3.get(2);
                if (list == null) {
                    throw new IllegalArgumentException(str);
                }
                int size = list.size();
                String[] strArr = new String[size];
                Class[] clsArr = new Class[size];
                Object[] objArr = new Object[size];
                for (int i3 = 0; i3 < size; i3++) {
                    Map map = (Map) list.get(i3);
                    if (map == null) {
                        throw new IllegalArgumentException(str);
                    }
                    if (map.size() != 1) {
                        throw new IllegalArgumentException(str);
                    }
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    String str4 = (String) entry.getKey();
                    if (str4 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    try {
                        Class a4 = c3.a(str4);
                        Object a5 = c3.a(a4, entry.getValue());
                        strArr[i3] = str4;
                        clsArr[i3] = a4;
                        objArr[i3] = a5;
                    } catch (ClassCastException e3) {
                        throw new IllegalArgumentException(str, e3);
                    } catch (ClassNotFoundException e4) {
                        throw new IllegalArgumentException(str, e4);
                    } catch (IllegalAccessException e5) {
                        throw new IllegalArgumentException(str, e5);
                    } catch (InstantiationException e6) {
                        throw new IllegalArgumentException(str, e6);
                    } catch (NoSuchMethodException e7) {
                        throw new IllegalArgumentException(str, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalArgumentException(str, e8);
                    }
                }
                List list2 = (List) a3.get(3);
                if (list2 == null) {
                    throw new IllegalArgumentException(str);
                }
                String[] strArr2 = new String[list2.size()];
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str5 = (String) list2.get(i4);
                    if (str5 == null) {
                        throw new IllegalArgumentException(str);
                    }
                    strArr2[i4] = str5;
                }
                return new z2(str2, str3, strArr, clsArr, objArr, strArr2);
            } catch (ClassCastException e9) {
                throw new IllegalArgumentException(str, e9);
            }
        } catch (IOException e10) {
            throw new IllegalArgumentException(str, e10);
        }
    }
}
