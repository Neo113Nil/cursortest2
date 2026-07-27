package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf;
import com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.pcc;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.openadsdk.core.lu;
import java.io.File;

/* loaded from: classes4.dex */
public class CacheDirFactory {
    public static volatile sf MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String pcc;

    public static int getCacheType() {
        return 1;
    }

    private static sf pcc() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    pcc pccVar = new pcc();
                    MEDIA_CACHE_DIR = pccVar;
                    pccVar.pcc(getRootDir());
                    MEDIA_CACHE_DIR.oo();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File pcc2 = qf.pcc(lu.pcc(), "tt_ad");
        if (pcc2.isFile()) {
            pcc2.delete();
        }
        if (!pcc2.exists()) {
            pcc2.mkdirs();
        }
        String absolutePath = pcc2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static sf getICacheDir(int i) {
        return pcc();
    }

    public static String getImageCacheDir(String str) {
        if (pcc == null) {
            pcc = getDiskCacheDirPath(str);
        }
        return pcc;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
