package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/izettle/android/auth/log/Logger$Level;", "level", "tag", "timestamped", "(Ljava/lang/String;Lcom/izettle/android/auth/log/Logger$Level;Ljava/lang/String;)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoggerKt {
    private static final java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", java.util.Locale.ENGLISH);

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String timestamped(java.lang.String str, com.izettle.android.auth.log.Logger.Level level, java.lang.String str2) {
        java.text.SimpleDateFormat simpleDateFormat = dateFormat;
        java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(new java.util.Date()));
        java.lang.String tag = level.getTag();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(parse);
        sb.append(" ");
        sb.append(tag);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
