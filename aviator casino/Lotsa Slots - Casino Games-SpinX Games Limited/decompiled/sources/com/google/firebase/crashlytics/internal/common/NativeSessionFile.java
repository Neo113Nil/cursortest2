package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
interface NativeSessionFile {
    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload();

    java.lang.String getReportsEndpointFilename();

    java.io.InputStream getStream();
}
