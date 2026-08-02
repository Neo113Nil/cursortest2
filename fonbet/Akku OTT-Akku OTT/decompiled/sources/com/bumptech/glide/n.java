package com.bumptech.glide;

import com.bumptech.glide.n;

/* loaded from: classes3.dex */
public abstract class n<CHILD extends n<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        ((n) obj).getClass();
        char[] cArr = com.bumptech.glide.util.m.a;
        Object obj2 = com.bumptech.glide.request.transition.a.a;
        return obj2.equals(obj2);
    }

    public int hashCode() {
        return com.bumptech.glide.request.transition.a.a.hashCode();
    }
}
