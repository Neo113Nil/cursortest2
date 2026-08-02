package com.datadog.trace.api;

/* loaded from: classes8.dex */
public class DDTags {
    public static final java.lang.String ANALYTICS_SAMPLE_RATE = "_dd1.sr.eausr";
    public static final java.lang.String BASE_SERVICE = "_dd.base_service";
    public static final java.lang.String CI_ENV_VARS = "_dd.ci.env_vars";
    public static final java.lang.String CI_ITR_TESTS_SKIPPED = "_dd.ci.itr.tests_skipped";
    public static final java.lang.String DB_STATEMENT = "sql.query";
    public static final java.lang.String ERROR_MSG = "error.message";
    public static final java.lang.String ERROR_STACK = "error.stack";
    public static final java.lang.String ERROR_TYPE = "error.type";

    @java.lang.Deprecated
    public static final java.lang.String EVENT_SAMPLE_RATE = "_dd1.sr.eausr";
    public static final java.lang.String HTTP_FRAGMENT = "http.fragment.string";
    public static final java.lang.String HTTP_QUERY = "http.query.string";
    public static final java.lang.String INTERNAL_GIT_COMMIT_SHA = "_dd.git.commit.sha";
    public static final java.lang.String INTERNAL_GIT_REPOSITORY_URL = "_dd.git.repository_url";
    public static final java.lang.String LANGUAGE_TAG_KEY = "language";
    public static final java.lang.String LANGUAGE_TAG_VALUE = "jvm";
    public static final java.lang.String LIBRARY_VERSION_TAG_KEY = "library_version";
    public static final java.lang.String MANUAL_DROP = "manual.drop";
    public static final java.lang.String MANUAL_KEEP = "manual.keep";
    public static final java.lang.String MEASURED = "_dd.measured";
    public static final java.lang.String ORIGIN_KEY = "_dd.origin";
    public static final java.lang.String PATHWAY_HASH = "pathway.hash";
    public static final java.lang.String PEER_SERVICE_REMAPPED_FROM = "_dd.peer.service.remapped_from";
    public static final java.lang.String PEER_SERVICE_SOURCE = "_dd.peer.service.source";
    public static final java.lang.String PID_TAG = "process_id";
    public static final java.lang.String PROFILING_CONTEXT_ENGINE = "_dd.profiling.ctx";
    public static final java.lang.String PROFILING_ENABLED = "_dd.profiling.enabled";
    public static final java.lang.String RESOURCE_NAME = "resource.name";
    public static final java.lang.String RUNTIME_ID_TAG = "runtime-id";
    public static final java.lang.String RUNTIME_VERSION_TAG = "runtime_version";
    public static final java.lang.String SCHEMA_DEFINITION = "schema.definition";
    public static final java.lang.String SCHEMA_ID = "schema.id";
    public static final java.lang.String SCHEMA_OPERATION = "schema.operation";
    public static final java.lang.String SCHEMA_TOPIC = "schema.topic";
    public static final java.lang.String SCHEMA_TYPE = "schema.type";
    public static final java.lang.String SCHEMA_VERSION_TAG_KEY = "_dd.trace_span_attribute_schema";
    public static final java.lang.String SCHEMA_WEIGHT = "schema.weight";
    public static final java.lang.String SERVICE_NAME = "service.name";
    public static final java.lang.String SPAN_LINKS = "_dd.span_links";
    public static final java.lang.String SPAN_TYPE = "span.type";
    public static final java.lang.String THREAD_ID = "thread.id";
    public static final java.lang.String THREAD_NAME = "thread.name";
    public static final java.lang.String TRACE_START_TIME = "t0";
    public static final java.lang.String USER_NAME = "user.principal";
}
