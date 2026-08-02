package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements CrashlyticsReportJsonTransform.ObjectParser {
    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        CrashlyticsReport.Session.Event.RolloutAssignment parseEventRolloutsAssignment;
        parseEventRolloutsAssignment = CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader);
        return parseEventRolloutsAssignment;
    }
}
