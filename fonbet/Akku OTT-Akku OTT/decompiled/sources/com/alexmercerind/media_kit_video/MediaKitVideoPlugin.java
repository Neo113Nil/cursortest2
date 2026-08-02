package com.alexmercerind.media_kit_video;

import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class MediaKitVideoPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private MethodChannel channel;
    private VideoOutputManager videoOutputManager;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMethodCall$0(long j, long j2, long j3, int i, int i2) {
        this.channel.invokeMethod("VideoOutput.Resize", new HashMap<String, Object>(j, j2, j3, i, i2) { // from class: com.alexmercerind.media_kit_video.MediaKitVideoPlugin.1
            final /* synthetic */ long val$handle;
            final /* synthetic */ int val$height;
            final /* synthetic */ long val$id;
            final /* synthetic */ long val$wid;
            final /* synthetic */ int val$width;

            {
                this.val$handle = j;
                this.val$id = j2;
                this.val$wid = j3;
                this.val$width = i;
                this.val$height = i2;
                put("handle", Long.valueOf(j));
                put("id", Long.valueOf(j2));
                put("wid", Long.valueOf(j3));
                put("rect", new HashMap<String, Object>() { // from class: com.alexmercerind.media_kit_video.MediaKitVideoPlugin.1.1
                    {
                        put("left", 0);
                        put("top", 0);
                        put("width", Integer.valueOf(AnonymousClass1.this.val$width));
                        put("height", Integer.valueOf(AnonymousClass1.this.val$height));
                    }
                });
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.alexmercerind/media_kit_video");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.videoOutputManager = new VideoOutputManager(flutterPluginBinding.getTextureRegistry());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "VideoOutputManager.SetSurfaceSize":
                this.videoOutputManager.setSurfaceSize(Long.parseLong((String) methodCall.argument("handle")), Integer.parseInt((String) methodCall.argument("width")), Integer.parseInt((String) methodCall.argument("height")));
                result.success(null);
                break;
            case "VideoOutputManager.Dispose":
                this.videoOutputManager.dispose(Long.parseLong((String) methodCall.argument("handle")));
                result.success(null);
                break;
            case "Utils.IsEmulator":
                result.success(Boolean.valueOf(Utils.isEmulator()));
                break;
            case "VideoOutputManager.Create":
                final long parseLong = Long.parseLong((String) methodCall.argument("handle"));
                this.videoOutputManager.create(parseLong, new TextureUpdateCallback() { // from class: com.alexmercerind.media_kit_video.a
                    @Override // com.alexmercerind.media_kit_video.TextureUpdateCallback
                    public final void onTextureUpdate(long j, long j2, int i, int i2) {
                        MediaKitVideoPlugin.this.lambda$onMethodCall$0(parseLong, j, j2, i, i2);
                    }
                });
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
