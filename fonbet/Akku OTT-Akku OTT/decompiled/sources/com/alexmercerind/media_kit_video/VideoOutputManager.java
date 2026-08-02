package com.alexmercerind.media_kit_video;

import io.flutter.view.TextureRegistry;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public class VideoOutputManager {
    private static final String TAG = "VideoOutputManager";
    private final TextureRegistry textureRegistryReference;
    private final HashMap<Long, VideoOutput> videoOutputs = new HashMap<>();
    private final Object lock = new Object();

    public VideoOutputManager(TextureRegistry textureRegistry) {
        this.textureRegistryReference = textureRegistry;
    }

    public void create(long j, TextureUpdateCallback textureUpdateCallback) {
        synchronized (this.lock) {
            try {
                Locale locale = Locale.ENGLISH;
                new StringBuilder("com.alexmercerind.media_kit_video.VideoOutputManager.create: ").append(j);
                if (!this.videoOutputs.containsKey(Long.valueOf(j))) {
                    this.videoOutputs.put(Long.valueOf(j), new VideoOutput(this.textureRegistryReference, textureUpdateCallback));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dispose(long j) {
        synchronized (this.lock) {
            try {
                Locale locale = Locale.ENGLISH;
                new StringBuilder("com.alexmercerind.media_kit_video.VideoOutputManager.dispose: ").append(j);
                if (this.videoOutputs.containsKey(Long.valueOf(j))) {
                    VideoOutput videoOutput = this.videoOutputs.get(Long.valueOf(j));
                    Objects.requireNonNull(videoOutput);
                    videoOutput.dispose();
                    this.videoOutputs.remove(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSurfaceSize(long j, int i, int i2) {
        synchronized (this.lock) {
            try {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb = new StringBuilder("com.alexmercerind.media_kit_video.VideoOutputManager.setSurfaceSize: ");
                sb.append(j);
                sb.append(" ");
                sb.append(i);
                sb.append(" ");
                sb.append(i2);
                if (this.videoOutputs.containsKey(Long.valueOf(j))) {
                    VideoOutput videoOutput = this.videoOutputs.get(Long.valueOf(j));
                    Objects.requireNonNull(videoOutput);
                    videoOutput.setSurfaceSize(i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
