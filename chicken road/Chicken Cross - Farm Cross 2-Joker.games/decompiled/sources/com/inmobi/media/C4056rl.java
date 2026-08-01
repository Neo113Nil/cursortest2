package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.inmobi.media.rl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4056rl extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4084sl f7357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4056rl(C4084sl c4084sl, int i) {
        super(i);
        this.f7357a = c4084sl;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i;
        i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f7357a.b.name());
    }
}
