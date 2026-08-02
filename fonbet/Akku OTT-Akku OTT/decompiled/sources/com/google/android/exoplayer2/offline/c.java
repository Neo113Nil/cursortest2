package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements TextOutput {
    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
    }
}
