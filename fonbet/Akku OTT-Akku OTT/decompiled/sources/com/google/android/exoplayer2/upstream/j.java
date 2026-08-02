package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements DataSource.Factory {
    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public final DataSource createDataSource() {
        return PlaceholderDataSource.b();
    }
}
