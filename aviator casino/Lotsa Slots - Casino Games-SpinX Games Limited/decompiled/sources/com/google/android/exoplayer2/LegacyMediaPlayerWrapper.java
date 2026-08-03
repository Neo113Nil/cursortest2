package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class LegacyMediaPlayerWrapper extends com.google.android.exoplayer2.SimpleBasePlayer {
    private boolean playWhenReady;
    private final android.media.MediaPlayer player;

    public LegacyMediaPlayerWrapper(android.os.Looper looper) {
        super(looper);
        this.player = new android.media.MediaPlayer();
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    protected com.google.android.exoplayer2.SimpleBasePlayer.State getState() {
        return new com.google.android.exoplayer2.SimpleBasePlayer.State.Builder().setAvailableCommands(new com.google.android.exoplayer2.Player.Commands.Builder().addAll(1).build()).setPlayWhenReady(this.playWhenReady, 1).build();
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        this.playWhenReady = z;
        if (z) {
            this.player.start();
        } else {
            this.player.pause();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }
}
