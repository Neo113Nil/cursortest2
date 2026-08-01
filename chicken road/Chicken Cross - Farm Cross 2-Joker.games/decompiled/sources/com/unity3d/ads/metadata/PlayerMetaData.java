package com.unity3d.ads.metadata;

import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    @Deprecated
    public PlayerMetaData(Context context) {
        super(context);
        setCategory("player");
    }

    @Deprecated
    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }
}
