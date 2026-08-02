package M;

import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f17199a = new Size(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Size f17200b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f17201c = new Size(640, 480);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f17202d = new Size(720, 480);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f17203e = new Size(1280, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f17204f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f17205g = new Size(1920, 1440);

    public static int a(@NonNull Size size) {
        return size.getHeight() * size.getWidth();
    }
}
