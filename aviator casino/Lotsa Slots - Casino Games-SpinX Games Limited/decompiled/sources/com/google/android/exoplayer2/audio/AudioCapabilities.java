package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class AudioCapabilities {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final java.lang.String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;
    public static final com.google.android.exoplayer2.audio.AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new com.google.android.exoplayer2.audio.AudioCapabilities(new int[]{2}, 8);
    private static final com.google.android.exoplayer2.audio.AudioCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = new com.google.android.exoplayer2.audio.AudioCapabilities(new int[]{2, 5, 6}, 8);
    private static final com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new com.google.common.collect.ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    public static com.google.android.exoplayer2.audio.AudioCapabilities getCapabilities(android.content.Context context) {
        return getCapabilities(context, com.google.android.exoplayer2.util.Util.registerReceiverNotExported(context, null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static com.google.android.exoplayer2.audio.AudioCapabilities getCapabilities(android.content.Context context, android.content.Intent intent) {
        if (deviceMaySetExternalSurroundSoundGlobalSetting() && android.provider.Settings.Global.getInt(context.getContentResolver(), EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            return EXTERNAL_SURROUND_SOUND_CAPABILITIES;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 29 && (com.google.android.exoplayer2.util.Util.isTv(context) || com.google.android.exoplayer2.util.Util.isAutomotive(context))) {
            return new com.google.android.exoplayer2.audio.AudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities.Api29.getDirectPlaybackSupportedEncodings(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        return new com.google.android.exoplayer2.audio.AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    static android.net.Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return android.provider.Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    public AudioCapabilities(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.supportedEncodings = copyOf;
            java.util.Arrays.sort(copyOf);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = i;
    }

    public boolean supportsEncoding(int i) {
        return java.util.Arrays.binarySearch(this.supportedEncodings, i) >= 0;
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public boolean isPassthroughPlaybackSupported(com.google.android.exoplayer2.Format format) {
        return getEncodingAndChannelConfigForPassthrough(format) != null;
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(com.google.android.exoplayer2.Format format) {
        int maxSupportedChannelCountForPassthrough;
        int encoding = com.google.android.exoplayer2.util.MimeTypes.getEncoding((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(java.lang.Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if (encoding == 8 && !supportsEncoding(8)) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        if (format.channelCount == -1 || encoding == 18) {
            maxSupportedChannelCountForPassthrough = getMaxSupportedChannelCountForPassthrough(encoding, format.sampleRate != -1 ? format.sampleRate : 48000);
        } else {
            maxSupportedChannelCountForPassthrough = format.channelCount;
            if (maxSupportedChannelCountForPassthrough > this.maxChannelCount) {
                return null;
            }
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(encoding), java.lang.Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.exoplayer2.audio.AudioCapabilities)) {
            return false;
        }
        com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities = (com.google.android.exoplayer2.audio.AudioCapabilities) obj;
        return java.util.Arrays.equals(this.supportedEncodings, audioCapabilities.supportedEncodings) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (java.util.Arrays.hashCode(this.supportedEncodings) * 31);
    }

    public java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", supportedEncodings=" + java.util.Arrays.toString(this.supportedEncodings) + com.ironsource.X3.j.e;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        return com.google.android.exoplayer2.util.Util.SDK_INT >= 17 && ("Amazon".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) || "Xiaomi".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER));
    }

    private static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 29) {
            return com.google.android.exoplayer2.audio.AudioCapabilities.Api29.getMaxSupportedChannelCountForPassthrough(i, i2);
        }
        return ((java.lang.Integer) com.google.android.exoplayer2.util.Assertions.checkNotNull(ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(java.lang.Integer.valueOf(i), 0))).intValue();
    }

    private static int getChannelConfigForPassthrough(int i) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 26 && "fugu".equals(com.google.android.exoplayer2.util.Util.DEVICE) && i == 1) {
            i = 2;
        }
        return com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(i);
    }

    private static final class Api29 {
        private static final android.media.AudioAttributes DEFAULT_AUDIO_ATTRIBUTES = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        private Api29() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] getDirectPlaybackSupportedEncodings() {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            com.google.common.collect.UnmodifiableIterator it = com.google.android.exoplayer2.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                if (android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), DEFAULT_AUDIO_ATTRIBUTES)) {
                    builder.add((com.google.common.collect.ImmutableList.Builder) num);
                }
            }
            builder.add((com.google.common.collect.ImmutableList.Builder) 2);
            return com.google.common.primitives.Ints.toArray(builder.build());
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
            for (int i3 = 8; i3 > 0; i3--) {
                if (android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(i3)).build(), DEFAULT_AUDIO_ATTRIBUTES)) {
                    return i3;
                }
            }
            return 0;
        }
    }
}
