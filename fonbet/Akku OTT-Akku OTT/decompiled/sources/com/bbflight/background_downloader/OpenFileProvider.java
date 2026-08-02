package com.bbflight.background_downloader;

import androidx.core.content.FileProvider;
import com.haryanvi.netstream.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbflight/background_downloader/OpenFileProvider;", "Landroidx/core/content/FileProvider;", "<init>", "()V", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenFileProvider extends FileProvider {
    public OpenFileProvider() {
        super(R.xml.bgd_file_paths);
    }
}
