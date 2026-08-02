package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0240g8 extends sj0 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2643n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0240g8(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.f2643n = i;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        switch (this.f2643n) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.sj0
    /* JADX INFO: renamed from: b */
    public final void mo1994b(Object obj) throws IOException {
        switch (this.f2643n) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // p000.sj0
    /* JADX INFO: renamed from: c */
    public final Object mo1995c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int i = this.f2643n;
        boolean z = this.f7128j;
        ContentResolver contentResolver2 = this.f7130l;
        switch (i) {
            case 0:
                AssetFileDescriptor assetFileDescriptorM3838h = (z && AbstractC0565p1.m3837g(uri) && AbstractC0565p1.m3836f()) ? AbstractC0565p1.m3838h(uri, contentResolver2) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorM3838h != null) {
                    return assetFileDescriptorM3838h;
                }
                dd0.m1168n(uri, "FileDescriptor is null for: ");
                return null;
            default:
                AssetFileDescriptor assetFileDescriptorM3838h2 = (z && AbstractC0565p1.m3837g(uri) && AbstractC0565p1.m3836f()) ? AbstractC0565p1.m3838h(uri, contentResolver2) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorM3838h2 != null) {
                    return assetFileDescriptorM3838h2.getParcelFileDescriptor();
                }
                dd0.m1168n(uri, "FileDescriptor is null for: ");
                return null;
        }
    }
}
