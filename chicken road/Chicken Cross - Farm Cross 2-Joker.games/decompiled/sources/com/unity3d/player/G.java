package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class G extends UnityPlayer.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ J c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j, UnityPlayer unityPlayer, int i) {
        super();
        this.c = j;
        this.b = i;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        boolean onNodeSelected;
        onNodeSelected = UnityAccessibilityDelegate.onNodeSelected(this.b);
        if (onNodeSelected) {
            this.c.f11713a.sendEventForVirtualViewId(this.b, 1);
        }
    }
}
