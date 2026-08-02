package com.amplitude.id.utilities;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public static final void a(File location) throws IOException {
        Intrinsics.checkNotNullParameter(location, "location");
        if (location.exists() || location.mkdirs() || location.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + location);
    }
}
