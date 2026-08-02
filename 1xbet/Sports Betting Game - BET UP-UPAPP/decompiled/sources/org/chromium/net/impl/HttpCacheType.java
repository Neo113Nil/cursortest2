package org.chromium.net.impl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface HttpCacheType {
    public static final int DISABLED = 0;
    public static final int DISK = 1;
    public static final int MEMORY = 2;
}
