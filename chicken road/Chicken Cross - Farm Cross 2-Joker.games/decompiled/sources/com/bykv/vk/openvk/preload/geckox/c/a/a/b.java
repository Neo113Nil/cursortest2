package com.bykv.vk.openvk.preload.geckox.c.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* compiled from: DownloadFullSingleFileInterceptor.java */
/* loaded from: classes5.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private File e;

    public static String a(UpdatePackage updatePackage, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
        }
        String substring = str.substring(lastIndexOf + 1);
        if (TextUtils.isEmpty(substring)) {
            throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
        }
        return substring;
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String channel = updatePackage.getChannel();
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", channel);
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = new File(this.e, updatePackage.getAccessKey() + File.separator + channel + File.separator + updatePackage.getVersion() + "--updating");
        file.mkdirs();
        File file2 = new File(file, "res" + File.separator + a(updatePackage, uri));
        this.d.a();
        com.bykv.vk.openvk.preload.geckox.buffer.a a2 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file2, length);
        try {
            try {
                this.d.i().downloadFile(uri, length, new BufferOutputStream(a2));
                try {
                    return bVar.a((com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a2, updatePackage));
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                a2.e();
                throw new com.bykv.vk.openvk.preload.geckox.b.a("download full single file failed! url:" + uri + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
            }
        } finally {
            try {
                a2.e();
            } catch (Exception e2) {
                GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e2);
            }
        }
    }
}
