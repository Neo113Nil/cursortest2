package com.datadog.trace.api.naming.v1;

/* loaded from: classes3.dex */
public class CloudNamingV1 implements com.datadog.trace.api.naming.NamingSchema.ForCloud {
    @Override // com.datadog.trace.api.naming.NamingSchema.ForCloud
    public java.lang.String serviceForRequest(java.lang.String str, java.lang.String str2) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.datadog.trace.api.naming.NamingSchema.ForCloud
    public java.lang.String operationForRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        char c;
        str3.hashCode();
        switch (str3.hashCode()) {
            case -966939047:
                if (str3.equals("SNS.Publish")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -720236259:
                if (str3.equals("SQS.ReceiveMessage")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -669404583:
                if (str3.equals("Sns.Publish")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -598247290:
                if (str3.equals("SQS.SendMessage")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -395215738:
                if (str3.equals("Sqs.SendMessage")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -267595180:
                if (str3.equals("SQS.SendMessageBatch")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 478776605:
                if (str3.equals("Sqs.ReceiveMessage")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 932531796:
                if (str3.equals("Sqs.SendMessageBatch")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
                return com.datadog.trace.api.naming.SpanNaming.instance().namingSchema().messaging().outboundOperation("sns");
            case 1:
            case 6:
                return com.datadog.trace.api.naming.SpanNaming.instance().namingSchema().messaging().inboundOperation("sqs");
            case 3:
            case 4:
            case 5:
            case 7:
                return com.datadog.trace.api.naming.SpanNaming.instance().namingSchema().messaging().outboundOperation("sqs");
            default:
                return com.datadog.trace.util.Strings.join(".", str, str2.toLowerCase(java.util.Locale.ROOT), "request");
        }
    }

    @Override // com.datadog.trace.api.naming.NamingSchema.ForCloud
    public java.lang.String operationForFaas(java.lang.String str) {
        return "aws.lambda.invoke";
    }
}
