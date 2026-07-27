package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private File f4642a;

    protected abstract InputStream a(File file, String str) throws IOException;

    protected abstract boolean b(File file, String str) throws IOException;

    public a(File file) {
        this.f4642a = file;
    }

    public final InputStream a(String str) throws IOException {
        return a(this.f4642a, str);
    }

    public final boolean b(String str) throws IOException {
        return b(this.f4642a, str);
    }
}
