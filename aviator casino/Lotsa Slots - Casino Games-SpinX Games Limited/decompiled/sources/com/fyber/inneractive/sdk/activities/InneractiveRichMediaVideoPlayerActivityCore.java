package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends android.app.Activity {
    public static final java.lang.String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final java.lang.String VIDEO_URL = "video_url";

    /* renamed from: a, reason: collision with root package name */
    public android.widget.VideoView f3517a;
    public int b = 0;
    public final com.fyber.inneractive.sdk.activities.n c = new com.fyber.inneractive.sdk.activities.n(this);

    public static boolean startRichMediaIntent(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra(VIDEO_URL, str);
        try {
            context.startActivity(intent);
            return true;
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new java.lang.Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_rich_media_video);
        this.f3517a = (android.widget.VideoView) findViewById(com.fyber.inneractive.sdk.R.id.mraid_video_view);
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = (intent == null || !intent.hasExtra(VIDEO_URL)) ? null : intent.getStringExtra(VIDEO_URL);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.fyber.inneractive.sdk.util.IAlog.a("Error: video can not be played.", new java.lang.Object[0]);
            finish();
        } else {
            this.f3517a.setVideoPath(stringExtra);
            this.f3517a.setOnCompletionListener(new com.fyber.inneractive.sdk.activities.p(this));
            this.f3517a.setOnErrorListener(new com.fyber.inneractive.sdk.activities.q(this));
            this.f3517a.setOnPreparedListener(this.c);
        }
        findViewById(com.fyber.inneractive.sdk.R.id.ia_iv_close_button).setOnClickListener(new com.fyber.inneractive.sdk.activities.o(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.b = this.f3517a.getCurrentPosition();
        this.f3517a.pause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.widget.VideoView videoView = this.f3517a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}
