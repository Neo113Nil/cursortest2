package com.google.firebase.messaging.reporting;

/* loaded from: classes4.dex */
public final class MessagingClientEventExtension {
    private static final com.google.firebase.messaging.reporting.MessagingClientEventExtension DEFAULT_INSTANCE = new com.google.firebase.messaging.reporting.MessagingClientEventExtension.Builder().build();
    private final com.google.firebase.messaging.reporting.MessagingClientEvent messaging_client_event_;

    MessagingClientEventExtension(com.google.firebase.messaging.reporting.MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    public final byte[] toByteArray() {
        return com.google.firebase.messaging.ProtoEncoderDoNotUse.encode(this);
    }

    public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.firebase.messaging.ProtoEncoderDoNotUse.encode(this, outputStream);
    }

    public static com.google.firebase.messaging.reporting.MessagingClientEventExtension.Builder newBuilder() {
        return new com.google.firebase.messaging.reporting.MessagingClientEventExtension.Builder();
    }

    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public final com.google.firebase.messaging.reporting.MessagingClientEvent getMessagingClientEvent() {
        com.google.firebase.messaging.reporting.MessagingClientEvent messagingClientEvent = this.messaging_client_event_;
        return messagingClientEvent == null ? com.google.firebase.messaging.reporting.MessagingClientEvent.getDefaultInstance() : messagingClientEvent;
    }

    @com.google.firebase.encoders.annotations.Encodable.Field(name = "messagingClientEvent")
    public final com.google.firebase.messaging.reporting.MessagingClientEvent getMessagingClientEventInternal() {
        return this.messaging_client_event_;
    }

    public static com.google.firebase.messaging.reporting.MessagingClientEventExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private com.google.firebase.messaging.reporting.MessagingClientEvent messaging_client_event_ = null;

        Builder() {
        }

        public final com.google.firebase.messaging.reporting.MessagingClientEventExtension build() {
            return new com.google.firebase.messaging.reporting.MessagingClientEventExtension(this.messaging_client_event_);
        }

        public final com.google.firebase.messaging.reporting.MessagingClientEventExtension.Builder setMessagingClientEvent(com.google.firebase.messaging.reporting.MessagingClientEvent messagingClientEvent) {
            this.messaging_client_event_ = messagingClientEvent;
            return this;
        }
    }
}
