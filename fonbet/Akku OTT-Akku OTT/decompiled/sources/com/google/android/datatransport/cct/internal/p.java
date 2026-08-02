package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NOT_SET", 0);
            a aVar2 = new a("EVENT_OVERRIDE", 1);
            a = aVar2;
            b = new a[]{aVar, aVar2};
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, aVar);
            sparseArray.put(5, aVar2);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    @Nullable
    public abstract s a();

    @Nullable
    public abstract a b();
}
